package Store.Store.service.api;

import Store.Store.dto.OwnerResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name = "owner-service", url = "http://owner-service:8093")

public interface OwnerClient {
    @GetMapping("/api/v1/owners/{id}")
    OwnerResponseDto findById(@PathVariable Long id);
}
