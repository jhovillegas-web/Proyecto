package pr_Owner.Owner.service;

import pr_Owner.Owner.dto.OwnerRequestDto;
import pr_Owner.Owner.dto.OwnerResponseDto;

import java.util.List;

public interface OwnerService {
    OwnerResponseDto findById(Long id);
    List<OwnerResponseDto> findAll();
    OwnerResponseDto create(OwnerRequestDto dto);
    OwnerResponseDto update(OwnerRequestDto dto);
    boolean deleteById(Long id);
}
