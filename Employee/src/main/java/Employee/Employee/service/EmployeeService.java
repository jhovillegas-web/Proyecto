package Employee.Employee.service;

import Employee.Employee.dto.EmployeeRequestDto;
import Employee.Employee.dto.EmployeeResponseDto;
import Employee.Employee.dto.EmployeeStoreResponseDto;

import java.util.List;

public interface EmployeeService  {
    EmployeeResponseDto findById(Long id);
    List<EmployeeResponseDto> findAll();
    EmployeeResponseDto create(EmployeeRequestDto dto);
    EmployeeResponseDto update(EmployeeRequestDto dto);
    EmployeeStoreResponseDto findEmployeeWithStore(Long id);
    List<EmployeeStoreResponseDto> findAllEmployeeWithStore();
    boolean deleteById(Long id);
}
