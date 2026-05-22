package Type_Employee.Type_Employee.controller;

import Type_Employee.Type_Employee.dto.TypeRequestDto;
import Type_Employee.Type_Employee.dto.TypeResponseDto;
import Type_Employee.Type_Employee.service.TypeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/types-employee")
@RequiredArgsConstructor
public class TypeController {
    private final TypeService service;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping
    public ResponseEntity<List<TypeResponseDto>> findAll() {
        logger.info("Ejecutando todos los Types-Store");
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TypeResponseDto> findById(@PathVariable Long id) {
        try {
            TypeResponseDto type = service.findById(id);
            if (type == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(service.findById(id));

        } catch (Exception e ) {
            logger.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<TypeResponseDto> create(@Valid @RequestBody TypeRequestDto dto) {
        TypeResponseDto createdtype = service.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdtype);
    }


    @PutMapping
    public ResponseEntity<TypeResponseDto> update(@RequestBody TypeRequestDto dto) {
        TypeResponseDto response = service.update(dto);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TypeResponseDto> delete(@PathVariable Long id) {

        boolean deleted = service.deleteById(id);

        if (deleted) {
            logger.info("Type Eliminado");
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }
}
