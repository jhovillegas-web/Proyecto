package Sale_Detail.Sale_Detail.service.Api;

import Sale_Detail.Sale_Detail.dto.Client.ClientResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "clients-service", url = "http://clients-service:8091")
public interface ClientClient {
    @GetMapping("/api/v1/clients/{id}")
    ClientResponseDto findById(@PathVariable Long id);
}
