package pr_Product.Product.service;

import pr_Product.Product.dto.ProductRequestDto;
import pr_Product.Product.dto.ProductResponseDto;

import java.util.List;

public interface ProductService {
    ProductResponseDto findById(Long id);
    List<ProductResponseDto> findAll();
    ProductResponseDto create(ProductRequestDto dto);
    ProductResponseDto update(ProductRequestDto dto);
    boolean deleteById(Long id);
}
