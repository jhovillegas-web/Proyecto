package Sales.Sales.service;

import Sales.Sales.dto.SalesRequestDto;
import Sales.Sales.dto.SalesResponseDto;

import java.util.List;

public interface SalesService {
    SalesResponseDto findById(Long id);
    List<SalesResponseDto> findAll();
    SalesResponseDto create(SalesRequestDto dto);
    SalesResponseDto update(SalesRequestDto dto);
    boolean deleteById(Long id);
}
