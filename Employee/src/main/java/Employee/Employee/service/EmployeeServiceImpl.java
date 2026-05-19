package Employee.Employee.service;

import Employee.Employee.dto.EmployeeRequestDto;
import Employee.Employee.dto.EmployeeResponseDto;
import Employee.Employee.dto.EmployeeStoreResponseDto;
import Employee.Employee.dto.StoreResponseDto;
import Employee.Employee.model.Employee;
import Employee.Employee.repository.EmployeeRepository;
import Employee.Employee.service.api.StoreClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository repository;
    private final StoreClient storeClient;

    private Employee toEntity(EmployeeResponseDto dto) {
        return new Employee(
                dto.getId(),
                dto.getId_store(),
                dto.getName(),
                dto.getLastName(),
                dto.getEmail(),
                dto.getPhone()
        );
    }

    private Employee toEntity(EmployeeRequestDto dto) {
        return new Employee(
                dto.getId(),
                dto.getId_store(),
                dto.getName(),
                dto.getLastName(),
                dto.getEmail(),
                dto.getPhone()
        );
    }

    private EmployeeResponseDto toDto(Employee Employee) {
        EmployeeResponseDto dto = new EmployeeResponseDto();
        dto.setId(Employee.getId());
        dto.setId_store(Employee.getId_store());
        dto.setName(Employee.getName());
        dto.setLastName(Employee.getLastName());
        dto.setEmail(Employee.getEmail());
        dto.setPhone(Employee.getPhone());

        return dto;
    }

    @Override
    public EmployeeResponseDto findById(Long id) {
        return repository.findById(id).map(this::toDto).orElse(null);
    }

    @Override
    public List<EmployeeResponseDto> findAll() {
        return repository.findAll().stream().map(this::toDto).toList();
    }

    @Override
    public EmployeeResponseDto create(EmployeeRequestDto dto) {
        return toDto(repository.save(toEntity(dto)));
    }

    @Override
    public EmployeeResponseDto update(EmployeeRequestDto dto) {
        return toDto(repository.save(toEntity(dto)));
    }


    public EmployeeStoreResponseDto findEmployeeWithStore(Long id) {

        Employee employee= repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Empleado no encontrado/a"));

        try {
            StoreResponseDto store = storeClient.findById(employee.getId_store());

            EmployeeStoreResponseDto response = new EmployeeStoreResponseDto();
            response.setId(employee.getId());
            response.setName(employee.getName());
            response.setLastName(employee.getLastName());
            response.setEmail(employee.getEmail());
            response.setPhone(employee.getPhone());
            response.setStore(store);

            return response;

        } catch (Exception e) {
            throw new RuntimeException("Error al obtener la Store");
        }
    }

    @Override
    public List<EmployeeStoreResponseDto> findAllEmployeeWithStore() {

        List<Employee> employees = repository.findAll();

        return employees.stream().map(employee -> {

            StoreResponseDto store = storeClient.findById(employee.getId_store());

            EmployeeStoreResponseDto response = new EmployeeStoreResponseDto();
            response.setId(employee.getId());
            response.setName(employee.getName());
            response.setLastName(employee.getLastName());
            response.setEmail(employee.getEmail());
            response.setPhone(employee.getPhone());
            response.setStore(store);

            return response;

        }).toList();
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
