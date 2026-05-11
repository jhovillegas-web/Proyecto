package pr_Product.Product.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pr_Product.Product.dto.ProductRequestDto;
import pr_Product.Product.dto.ProductResponseDto;
import pr_Product.Product.model.Product;
import pr_Product.Product.repository.ProductRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    
    private final ProductRepository repository;

    private Product toEntity(ProductResponseDto dto) {
        return new Product(
                dto.getId(),
                dto.getName(),
                dto.getType(),
                dto.getDescription()
        );
    }

    private Product toEntity(ProductRequestDto dto) {
        return new Product(
                dto.getId(),
                dto.getName(),
                dto.getType(),
                dto.getDescription()

        );
    }

    private ProductResponseDto toDto(Product Product) {
        ProductResponseDto dto = new ProductResponseDto();
        dto.setId(Product.getId());
        dto.setName(Product.getName());
        dto.setType(Product.getType());
        dto.setDescription(Product.getDescription());
        return dto;
    }

    @Override
    public ProductResponseDto findById(Long id) {
        return repository.findById(id).map(this::toDto).orElse(null);
    }

    @Override
    public List<ProductResponseDto> findAll() {
        return repository.findAll().stream().map(this::toDto).toList();
    }

    @Override
    public ProductResponseDto create(ProductRequestDto dto) {
        return toDto(repository.save(toEntity(dto)));
    }

    @Override
    public ProductResponseDto update(ProductRequestDto dto) {
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
