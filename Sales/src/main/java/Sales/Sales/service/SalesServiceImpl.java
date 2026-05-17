package Sales.Sales.service;

import Sales.Sales.dto.SalesRequestDto;
import Sales.Sales.dto.SalesResponseDto;
import Sales.Sales.model.Sales;
import Sales.Sales.repository.SalesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class SalesServiceImpl implements  SalesService{
    private final SalesRepository repository;

    private Sales toEntity(SalesResponseDto dto) {
        return new Sales(
                dto.getId(),
                dto.getId_client(),
                dto.getId_store(),
                dto.getTotal()
        );
    }

    private Sales toEntity(SalesRequestDto dto) {
        return new Sales(
                dto.getId(),
                dto.getId_client(),
                dto.getId_store(),
                dto.getTotal()

        );
    }

    private SalesResponseDto toDto(Sales Sales) {
        SalesResponseDto dto = new SalesResponseDto();
        dto.setId(Sales.getId());
        dto.setId_client(Sales.getId_client());
        dto.setId_store(Sales.getId_store());
        dto.setTotal(Sales.getTotal());
        return dto;
    }

    @Override
    public SalesResponseDto findById(Long id) {
        return repository.findById(id).map(this::toDto).orElse(null);
    }

    @Override
    public List<SalesResponseDto> findAll() {
        return repository.findAll().stream().map(this::toDto).toList();
    }

    @Override
    public SalesResponseDto create(SalesRequestDto dto) {
        return toDto(repository.save(toEntity(dto)));
    }

    @Override
    public SalesResponseDto update(SalesRequestDto dto) {
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
