package Sale_Detail.Sale_Detail.service.Api;

import Sale_Detail.Sale_Detail.dto.Client.ClientResponseDto;
import Sale_Detail.Sale_Detail.dto.Product.ProductResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", url = "http://product-service:8092")

public interface ProductClient {
    @GetMapping("/api/v1/products/{id}")
    ProductResponseDto findById(@PathVariable Long id);
}
