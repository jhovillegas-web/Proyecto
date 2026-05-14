package Stock.Stock.service;

import Stock.Stock.dto.StockRequestDto;
import Stock.Stock.dto.StockResponseDto;

import java.util.List;

public interface StockService {
    StockResponseDto findById(Long id);
    List<StockResponseDto> findAll();
    StockResponseDto create(StockRequestDto dto);
    StockResponseDto update(StockRequestDto dto);
    boolean deleteById(Long id);
}
