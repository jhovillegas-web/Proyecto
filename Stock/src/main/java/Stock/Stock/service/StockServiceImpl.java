package Stock.Stock.service;

import Stock.Stock.dto.*;
import Stock.Stock.model.Stock;
import Stock.Stock.repository.StockRepository;
import Stock.Stock.service.API.ProductClient;
import Stock.Stock.service.API.StoreClient;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.Store;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class StockServiceImpl implements StockService {
    private final StockRepository repository;
    private final StoreClient storeClient;
    private final ProductClient productClient;

    private Stock toEntity(StockResponseDto dto) {
        return new Stock(
                dto.getId(),
                dto.getId_product(),
                dto.getId_store(),
                dto.getPrice(),
                dto.getQuantity(),
                dto.getStatus()
        );
    }

    private Stock toEntity(StockRequestDto dto) {
        return new Stock(
                dto.getId(),
                dto.getId_product(),
                dto.getId_store(),
                dto.getPrice(),
                dto.getQuantity(),
                dto.getStatus()
        );
    }

    private StockResponseDto toDto(Stock Stock) {
        StockResponseDto dto = new StockResponseDto();
        dto.setId(Stock.getId());
        dto.setId_product(Stock.getId_product());
        dto.setId_store(Stock.getId_store());
        dto.setPrice(Stock.getPrice());
        dto.setQuantity(Stock.getQuantity());
        dto.setStatus(Stock.getStatus());

        return dto;
    }


    public AllResponseDto findStock(Long id) {

        Stock stock = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Stock no encontrado"));

        try {
            StoreResponseDto store = storeClient.findById(stock.getId_store());
            ProductResponseDto product = productClient.findById(stock.getId_product());

            AllResponseDto response = new AllResponseDto();
            response.setId(stock.getId());
            response.setPrice(stock.getPrice());
            response.setQuantity(stock.getQuantity());
            response.setStatus(stock.getStatus());
            response.setProduct(product);
            response.setStore(store);

            return response;

        } catch (Exception e) {
            throw new RuntimeException("Error al obtener la tienda");
        }
    }



    @Override
    public List<AllResponseDto> findAllStocks() {

        List<Stock> stocks = repository.findAll();

        return stocks.stream().map(stock -> {

            StoreResponseDto store = storeClient.findById(stock.getId_store());
            ProductResponseDto product = productClient.findById(stock.getId_product());

            AllResponseDto response = new AllResponseDto();
            response.setId(stock.getId());
            response.setPrice(stock.getPrice());
            response.setQuantity(stock.getQuantity());
            response.setStatus(stock.getStatus());
            response.setProduct(product);
            response.setStore(store);

            return response;

        }).toList();
    }







    @Override
    public StockResponseDto findById(Long id) {
        return repository.findById(id).map(this::toDto).orElse(null);
    }

    @Override
    public List<StockResponseDto> findAll() {
        return repository.findAll().stream().map(this::toDto).toList();
    }

    @Override
    public StockResponseDto create(StockRequestDto dto) {
        return toDto(repository.save(toEntity(dto)));
    }

    @Override
    public StockResponseDto update(StockRequestDto dto) {
        return toDto(repository.save(toEntity(dto)));
    }

    @Override
    public boolean deleteById(Long id) {
        if  (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
