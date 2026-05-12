package pr_Owner.Owner.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pr_Owner.Owner.dto.OwnerRequestDto;
import pr_Owner.Owner.dto.OwnerResponseDto;
import pr_Owner.Owner.model.Owner;
import pr_Owner.Owner.repository.OwnerRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OwnerServiceImpl implements OwnerService {
    private final OwnerRepository repository;

    private Owner toEntity(OwnerResponseDto dto) {
        return new Owner(
                dto.getId(),
                dto.getName(),
                dto.getLastName(),
                dto.getEmail(),
                dto.getPhone()
        );
    }

    private Owner toEntity(OwnerRequestDto dto) {
        return new Owner(
                dto.getId(),
                dto.getName(),
                dto.getLastName(),
                dto.getEmail(),
                dto.getPhone()
        );
    }

    private OwnerResponseDto toDto(Owner Owner) {
        OwnerResponseDto dto = new OwnerResponseDto();
        dto.setId(Owner.getId());
        dto.setName(Owner.getName());
        dto.setLastName(Owner.getLastName());
        dto.setEmail(Owner.getEmail());
        dto.setPhone(Owner.getPhone());

        return dto;
    }

    @Override
    public OwnerResponseDto findById(Long id) {
        return repository.findById(id).map(this::toDto).orElse(null);
    }

    @Override
    public List<OwnerResponseDto> findAll() {
        return repository.findAll().stream().map(this::toDto).toList();
    }

    @Override
    public OwnerResponseDto create(OwnerRequestDto dto) {
        return toDto(repository.save(toEntity(dto)));
    }

    @Override
    public OwnerResponseDto update(OwnerRequestDto dto) {
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
