package Store.Store.service;

import Store.Store.dto.StoreRequestDto;
import Store.Store.dto.StoreResponseDto;

import java.util.List;

public interface StoreService {
    StoreResponseDto findById(Long id);
    List<StoreResponseDto> findAll();
    StoreResponseDto create(StoreRequestDto dto);
    StoreResponseDto update(StoreRequestDto dto);
    boolean deleteById(Long id);
}
