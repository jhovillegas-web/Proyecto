package Type_Employee.Type_Employee.service;

import Type_Employee.Type_Employee.dto.TypeRequestDto;
import Type_Employee.Type_Employee.dto.TypeResponseDto;
import Type_Employee.Type_Employee.model.Type_Employee;
import Type_Employee.Type_Employee.repository.TypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TypeServiceImpl implements TypeService{
    private final TypeRepository repository;

    private Type_Employee toEntity(TypeResponseDto dto) {
        return new Type_Employee(
                dto.getId(),
                dto.getName()
        );
    }

    private Type_Employee toEntity(TypeRequestDto dto) {
        return new Type_Employee(
                dto.getId(),
                dto.getName()
        );
    }

    private TypeResponseDto toDto(Type_Employee Type) {
        TypeResponseDto dto = new TypeResponseDto();
        dto.setId(Type.getId());
        dto.setName(Type.getName());

        return dto;
    }

    @Override
    public TypeResponseDto findById(Long id) {
        return repository.findById(id).map(this::toDto).orElse(null);
    }

    @Override
    public List<TypeResponseDto> findAll() {
        return repository.findAll().stream().map(this::toDto).toList();
    }

    @Override
    public TypeResponseDto create(TypeRequestDto dto) {
        return toDto(repository.save(toEntity(dto)));
    }

    @Override
    public TypeResponseDto update(TypeRequestDto dto) {
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
