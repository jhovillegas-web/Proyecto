package Employee.Employee.service.api;

import Employee.Employee.dto.StoreResponseDto;
import Employee.Employee.dto.TypeResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "type-service", url = "http://typeemployee-service:8100")
public interface TypeClient {

    @GetMapping("/api/v1/types-employee/{id}")
    TypeResponseDto findById(@PathVariable Long id);
}
