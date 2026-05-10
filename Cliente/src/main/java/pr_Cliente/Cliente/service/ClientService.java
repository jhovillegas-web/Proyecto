package pr_Cliente.Cliente.service;
import pr_Cliente.Cliente.dto.ClientRequestDto;
import pr_Cliente.Cliente.dto.ClientResponseDto;
import java.util.List;

public interface ClientService {
    ClientResponseDto findById(Long id);
    List<ClientResponseDto> findAll();
    ClientResponseDto create(ClientRequestDto dto);
    ClientResponseDto update(ClientRequestDto dto);
    boolean deleteById(Long id);
}
