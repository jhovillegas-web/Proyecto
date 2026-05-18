package Store.Store.service;

import Store.Store.dto.*;
import Store.Store.model.Store;
import Store.Store.repository.StoreRepository;
import Store.Store.service.api.OwnerClient;
import Store.Store.service.api.TypeClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class StoreServiceImpl implements StoreService {
    private final StoreRepository repository;
    private final OwnerClient ownerClient;
    private final TypeClient typeClient;

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
    public OwnerStoreResponseDto findStoreWithOwner(Long id) {

        Store store = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Store no encontrada"));

        try {
            OwnerResponseDto owner = ownerClient.findById(store.getId_owner());

            OwnerStoreResponseDto response = new OwnerStoreResponseDto();
            response.setId(store.getId());
            response.setName(store.getName());
            response.setOwner(owner);

            return response;

        } catch (Exception e) {
            throw new RuntimeException("Error al obtener el owner");
        }
    }

    @Override
    public List<OwnerStoreResponseDto> findAllStoresWithOwners() {

        List<Store> stores = repository.findAll();

        return stores.stream().map(store -> {

            OwnerResponseDto owner = ownerClient.findById(store.getId_owner());

            OwnerStoreResponseDto response = new OwnerStoreResponseDto();
            response.setId(store.getId());
            response.setName(store.getName());
            response.setOwner(owner);

            return response;

        }).toList();
    }

    @Override
    public List<TypeStoreResponseDto> findAllStoresWithTypes() {

        List<Store> stores = repository.findAll();

        return stores.stream().map(store -> {

            TypeResponseDto type = typeClient.findById(store.getId_type());

            TypeStoreResponseDto response = new TypeStoreResponseDto();
            response.setId(store.getId());
            response.setName(store.getName());
            response.setType(type);

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
