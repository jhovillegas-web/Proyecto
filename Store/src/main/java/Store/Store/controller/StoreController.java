package Store.Store.controller;

import Store.Store.dto.OwnerStoreResponseDto;
import Store.Store.dto.StoreRequestDto;
import Store.Store.dto.StoreResponseDto;
import Store.Store.dto.TypeStoreResponseDto;
import Store.Store.service.StoreService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/stores")
@RequiredArgsConstructor
public class StoreController {
    private final StoreService service;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping
    public ResponseEntity<List<StoreResponseDto>> findAll() {
        logger.info("Ejecutando todos los Stores");
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StoreResponseDto> findById(@PathVariable Long id) {
        try {
            StoreResponseDto patient = service.findById(id);
            if (patient == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(service.findById(id));

        } catch (Exception e ) {
            logger.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/owner/{id}")
    public ResponseEntity<OwnerStoreResponseDto> getStoreWithOwner(@PathVariable Long id) {

        return ResponseEntity.ok(service.findStoreWithOwner(id));
    }

    @GetMapping("/with-owners")
    public ResponseEntity<List<OwnerStoreResponseDto>> getAllStoresWithOwners() {
        return ResponseEntity.ok(service.findAllStoresWithOwners());
    }

    @GetMapping("/with-types")
    public ResponseEntity<List<TypeStoreResponseDto>> getAllStoresWhitTypes() {
        return ResponseEntity.ok(service.findAllStoresWithTypes());
    }



    @PostMapping
    public ResponseEntity<StoreResponseDto> create(@Valid @RequestBody StoreRequestDto dto) {
        StoreResponseDto createdPatient = service.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPatient);
    }
}
