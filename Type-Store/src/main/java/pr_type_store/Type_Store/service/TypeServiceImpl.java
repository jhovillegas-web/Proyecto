package pr_type_store.Type_Store.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pr_type_store.Type_Store.dto.TypeRequestDto;
import pr_type_store.Type_Store.dto.TypeResponseDto;
import pr_type_store.Type_Store.model.Type_store;
import pr_type_store.Type_Store.repository.TypeRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TypeServiceImpl implements TypeService {
    private final TypeRepository repository;

    private Type_store toEntity(TypeResponseDto dto) {
        return new Type_store(
                dto.getId(),
                dto.getName()
        );
    }

    private Type_store toEntity(TypeRequestDto dto) {
        return new Type_store(
                dto.getId(),
                dto.getName()
        );
    }

    private TypeResponseDto toDto(Type_store Type) {
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
