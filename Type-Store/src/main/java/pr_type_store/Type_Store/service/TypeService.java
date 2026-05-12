package pr_type_store.Type_Store.service;

import pr_type_store.Type_Store.dto.TypeRequestDto;
import pr_type_store.Type_Store.dto.TypeResponseDto;

import java.util.List;

public interface TypeService {
    TypeResponseDto findById(Long id);
    List<TypeResponseDto> findAll();
    TypeResponseDto create(TypeRequestDto dto);
    TypeResponseDto update(TypeRequestDto dto);
    boolean deleteById(Long id);
}
