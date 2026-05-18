package Store.Store.service;

import Store.Store.dto.OwnerStoreResponseDto;
import Store.Store.dto.StoreRequestDto;
import Store.Store.dto.StoreResponseDto;
import Store.Store.dto.TypeStoreResponseDto;

import java.util.List;

public interface StoreService {
    StoreResponseDto findById(Long id);
    List<StoreResponseDto> findAll();
    StoreResponseDto create(StoreRequestDto dto);
    StoreResponseDto update(StoreRequestDto dto);
    OwnerStoreResponseDto findStoreWithOwner(Long id);
    List<OwnerStoreResponseDto> findAllStoresWithOwners();
    List<TypeStoreResponseDto> findAllStoresWithTypes();
    boolean deleteById(Long id);
}
