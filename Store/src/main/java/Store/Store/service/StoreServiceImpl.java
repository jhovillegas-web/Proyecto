package Store.Store.service;

import Store.Store.dto.StoreRequestDto;
import Store.Store.dto.StoreResponseDto;
import Store.Store.model.Store;
import Store.Store.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class StoreServiceImpl implements StoreService {
    private final StoreRepository repository;

    private Store toEntity(StoreResponseDto dto) {
        return new Store(
                dto.getId(),
                dto.getId_owner(),
                dto.getId_type(),
                dto.getName()
        );
    }

    private Store toEntity(StoreRequestDto dto) {
        return new Store(
                dto.getId(),
                dto.getId_owner(),
                dto.getId_type(),
                dto.getName()
        );
    }

    private StoreResponseDto toDto(Store Store) {
        StoreResponseDto dto = new StoreResponseDto();
        dto.setId(Store.getId());
        dto.setId_owner(Store.getId_owner());
        dto.setId_type(Store.getId_type());
        dto.setName(Store.getName());

        return dto;
    }

    @Override
    public StoreResponseDto findById(Long id) {
        return repository.findById(id).map(this::toDto).orElse(null);
    }

    @Override
    public List<StoreResponseDto> findAll() {
        return repository.findAll().stream().map(this::toDto).toList();
    }

    @Override
    public StoreResponseDto create(StoreRequestDto dto) {
        return toDto(repository.save(toEntity(dto)));
    }

    @Override
    public StoreResponseDto update(StoreRequestDto dto) {
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
