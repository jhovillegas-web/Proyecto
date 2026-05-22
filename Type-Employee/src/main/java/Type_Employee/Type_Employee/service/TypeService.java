package Type_Employee.Type_Employee.service;

import Type_Employee.Type_Employee.dto.TypeRequestDto;
import Type_Employee.Type_Employee.dto.TypeResponseDto;

import java.util.List;

public interface TypeService {
    TypeResponseDto findById(Long id);
    List<TypeResponseDto> findAll();
    TypeResponseDto create(TypeRequestDto dto);
    TypeResponseDto update(TypeRequestDto dto);
    boolean deleteById(Long id);
}
