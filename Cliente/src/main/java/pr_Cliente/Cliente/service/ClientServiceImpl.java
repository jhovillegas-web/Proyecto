package pr_Cliente.Cliente.service;

import pr_Cliente.Cliente.dto.ClientRequestDto;
import pr_Cliente.Cliente.dto.ClientResponseDto;
import pr_Cliente.Cliente.model.Client;
import pr_Cliente.Cliente.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService{

    private final ClientRepository repository;

    private Client toEntity(ClientResponseDto dto) {
        return new Client(
                dto.getId(),
                dto.getName(),
                dto.getLastName(),
                dto.getEmail(),
                dto.getPhone()
        );
    }

    private Client toEntity(ClientRequestDto dto) {
        return new Client(
                dto.getId(),
                dto.getName(),
                dto.getLastName(),
                dto.getEmail(),
                dto.getPhone()
        );
    }

    private ClientResponseDto toDto(Client client) {
        ClientResponseDto dto = new ClientResponseDto();
        dto.setId(client.getId());
        dto.setName(client.getName());
        dto.setLastName(client.getLastName());
        dto.setEmail(client.getEmail());
        dto.setPhone(client.getPhone());

        return dto;
    }

    @Override
    public ClientResponseDto findById(Long id) {
        return repository.findById(id).map(this::toDto).orElse(null);
    }

    @Override
    public List<ClientResponseDto> findAll() {
        return repository.findAll().stream().map(this::toDto).toList();
    }

    @Override
    public ClientResponseDto create(ClientRequestDto dto) {
        return toDto(repository.save(toEntity(dto)));
    }

    @Override
    public ClientResponseDto update(ClientRequestDto dto) {
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

