package Sale_Detail.Sale_Detail.service.Api;

import Sale_Detail.Sale_Detail.dto.Sale.SaleResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "sale-service", url = "http://sale-service:8097")

public interface SaleClient {
    @GetMapping("/api/v1/sales/{id}")
    SaleResponseDto findById(@PathVariable Long id);

}
