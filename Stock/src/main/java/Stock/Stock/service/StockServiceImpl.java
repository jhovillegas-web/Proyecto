package Stock.Stock.service;

import Stock.Stock.dto.StockRequestDto;
import Stock.Stock.dto.StockResponseDto;
import Stock.Stock.model.Stock;
import Stock.Stock.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class StockServiceImpl implements StockService {
    private final StockRepository repository;

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
