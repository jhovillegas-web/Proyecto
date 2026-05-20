package Stock.Stock.controller;

import Stock.Stock.dto.AllResponseDto;
import Stock.Stock.dto.StockRequestDto;
import Stock.Stock.dto.StockResponseDto;
import Stock.Stock.service.StockService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/stocks")
@RequiredArgsConstructor
public class StockController {
    private final StockService service;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping
    public ResponseEntity<List<StockResponseDto>> findAll() {
        logger.info("Ejecutando todos los Stocks");
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StockResponseDto> findById(@PathVariable Long id) {
        try {
            StockResponseDto patient = service.findById(id);
            if (patient == null) {
                return ResponseEntity.notFound().build();
            }
            logger.info("Ejecutando Stock por ID");
            return ResponseEntity.ok(service.findById(id));

        } catch (Exception e ) {
            logger.error(e.getMessage());
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/with-all/{id}")
    public ResponseEntity<AllResponseDto> getStockWithProduct(@PathVariable Long id) {
        logger.info("Ejecutando el Stocks por ID con toda la informacion");
        return ResponseEntity.ok(service.findStock(id));
    }

    @GetMapping("/with-all")
    public ResponseEntity<List<AllResponseDto>> getAllStoresWithOwners() {
        logger.info("Ejecutando todos los Stocks con toda la informacion");
        return ResponseEntity.ok(service.findAllStocks());
    }

    @PostMapping
    public ResponseEntity<StockResponseDto> create(@Valid @RequestBody StockRequestDto dto) {
        StockResponseDto createdPatient = service.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPatient);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<StockResponseDto> delete(@PathVariable Long id) {

        boolean deleted = service.deleteById(id);

        if (deleted) {
            logger.info("Stock Eliminado");
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }
}
