package Sale_Detail.Sale_Detail.service;

import Sale_Detail.Sale_Detail.dto.SaleDetailRequestDto;
import Sale_Detail.Sale_Detail.dto.SaleDetailResponseDto;
import Sale_Detail.Sale_Detail.model.SaleDetail;
import Sale_Detail.Sale_Detail.repository.SaleDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class SaleDetailServiceImpl implements SaleDetailService{
    private final SaleDetailRepository repository;

    private SaleDetail toEntity(SaleDetailResponseDto dto) {
        return new SaleDetail(
                dto.getId(),
                dto.getId_sale(),
                dto.getId_product(),
                dto.getDate(),
                dto.getQuantity()
        );
    }

    private SaleDetail toEntity(SaleDetailRequestDto dto) {
        return new SaleDetail(
                dto.getId(),
                dto.getId_sale(),
                dto.getId_product(),
                dto.getDate(),
                dto.getQuantity()

        );
    }

    private SaleDetailResponseDto toDto(SaleDetail SaleDetail) {
        SaleDetailResponseDto dto = new SaleDetailResponseDto();
        dto.setId(SaleDetail.getId());
        dto.setId_sale(SaleDetail.getId_sale());
        dto.setId_product(SaleDetail.getId_product());
        dto.setDate(SaleDetail.getDate());
        dto.setQuantity(SaleDetail.getQuantity());
        return dto;
    }

    @Override
    public SaleDetailResponseDto findById(Long id) {
        return repository.findById(id).map(this::toDto).orElse(null);
    }

    @Override
    public List<SaleDetailResponseDto> findAll() {
        return repository.findAll().stream().map(this::toDto).toList();
    }

    @Override
    public SaleDetailResponseDto create(SaleDetailRequestDto dto) {
        return toDto(repository.save(toEntity(dto)));
    }

    @Override
    public SaleDetailResponseDto update(SaleDetailRequestDto dto) {
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
