package Store.Store.service.api;

import Store.Store.dto.OwnerResponseDto;
import Store.Store.dto.TypeResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name = "type-service", url = "http://typestore-service:8094")
public interface TypeClient {

    @GetMapping("/api/v1/typestores/{id}")
    TypeResponseDto findById(@PathVariable Long id);


}
