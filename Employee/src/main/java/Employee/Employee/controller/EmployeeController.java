package Employee.Employee.controller;

import Employee.Employee.dto.EmployeeRequestDto;
import Employee.Employee.dto.EmployeeResponseDto;
import Employee.Employee.dto.EmployeeStoreResponseDto;
import Employee.Employee.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService service;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping
    public ResponseEntity<List<EmployeeResponseDto>> findAll() {
        logger.info("Ejecutando un findAll de Employees");
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponseDto> findById(@PathVariable Long id) {
        try {
            EmployeeResponseDto patient = service.findById(id);
            if (patient == null) {
                return ResponseEntity.notFound().build();
            }
            logger.info("Ejecutando busqueda de Employee por ID");
            return ResponseEntity.ok(service.findById(id));

        } catch (Exception e ) {
            logger.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/store/{id}")
    public ResponseEntity<EmployeeStoreResponseDto> getStoreWithOwner(@PathVariable Long id) {
        logger.info("Ejecutando busqueda de Employee por ID de Store");
        return ResponseEntity.ok(service.findEmployeeWithStore(id));
    }

    @GetMapping("/with-stores")
    public ResponseEntity<List<EmployeeStoreResponseDto>> getAllStoresWithOwners() {
        logger.info("Ejecutando Todos los Employees por con su Store");
        return ResponseEntity.ok(service.findAllEmployeeWithStore());
    }

    @PostMapping
    public ResponseEntity<EmployeeResponseDto> create(@Valid @RequestBody EmployeeRequestDto dto) {
        EmployeeResponseDto createdPatient = service.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPatient);
    }
}
