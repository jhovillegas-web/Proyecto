package Stock.Stock.service.API;

import Stock.Stock.dto.StoreResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "store-service", url = "http://localhost:8085")
public interface StoreClient {
    @GetMapping("/api/v1/stores/{id}")
    StoreResponseDto findById(@PathVariable Long id);
}
