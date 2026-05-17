package Sales.Sales.controller;

import Sales.Sales.dto.SalesRequestDto;
import Sales.Sales.dto.SalesResponseDto;
import Sales.Sales.service.SalesService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/Sales")
@RequiredArgsConstructor
public class SalesController {
    private final SalesService service;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping
    public ResponseEntity<List<SalesResponseDto>> findAll() {
        logger.info("Ejecutando todos los Sales");
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SalesResponseDto> findById(@PathVariable Long id) {
        try {
            SalesResponseDto patient = service.findById(id);
            if (patient == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(service.findById(id));

        } catch (Exception e ) {
            logger.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<SalesResponseDto> create(@Valid @RequestBody SalesRequestDto dto) {
        SalesResponseDto createdPatient = service.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPatient);
    }
}
