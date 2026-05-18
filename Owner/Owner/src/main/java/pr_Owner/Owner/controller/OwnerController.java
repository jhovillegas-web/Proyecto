package pr_Owner.Owner.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pr_Owner.Owner.dto.OwnerRequestDto;
import pr_Owner.Owner.dto.OwnerResponseDto;
import pr_Owner.Owner.service.OwnerService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/owners")
@RequiredArgsConstructor
public class OwnerController {
    private final OwnerService service;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping
    public ResponseEntity<List<OwnerResponseDto>> findAll() {
        logger.info("Ejecutando traer todos los Owners");
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<OwnerResponseDto> findById(@PathVariable Long id) {
        try {
            OwnerResponseDto patient = service.findById(id);
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
    public ResponseEntity<OwnerResponseDto> create(@Valid @RequestBody OwnerRequestDto dto) {
        OwnerResponseDto createdPatient = service.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPatient);
    }
}
