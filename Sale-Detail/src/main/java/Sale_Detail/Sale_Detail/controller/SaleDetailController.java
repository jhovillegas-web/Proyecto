package Sale_Detail.Sale_Detail.controller;

import Sale_Detail.Sale_Detail.dto.AllResponseDto;
import Sale_Detail.Sale_Detail.dto.SaleDetailRequestDto;
import Sale_Detail.Sale_Detail.dto.SaleDetailResponseDto;
import Sale_Detail.Sale_Detail.service.SaleDetailService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/sale-details")
@RequiredArgsConstructor
public class SaleDetailController {
    private final SaleDetailService service;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping
    public ResponseEntity<List<SaleDetailResponseDto>> findAll() {
        logger.info("Ejecutando todos los SaleDetail");
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SaleDetailResponseDto> findById(@PathVariable Long id) {
        try {
            SaleDetailResponseDto patient = service.findById(id);
            if (patient == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(service.findById(id));

        } catch (Exception e ) {
            logger.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/with-all")
    public ResponseEntity<List<AllResponseDto>> getAllInfo() {
        logger.info("Ejecutando todos los Sale-Details Con toda la Informacion.");
        return ResponseEntity.ok(service.findAllInfo());
    }

    @PostMapping
    public ResponseEntity<SaleDetailResponseDto> create(@Valid @RequestBody SaleDetailRequestDto dto) {
        SaleDetailResponseDto createdPatient = service.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPatient);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<SaleDetailResponseDto> delete(@PathVariable Long id) {

        boolean deleted = service.deleteById(id);

        if (deleted) {
            logger.info("Sale-Detail Eliminado");
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }
}
