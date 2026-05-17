package Sale_Detail.Sale_Detail.service;

import Sale_Detail.Sale_Detail.dto.SaleDetailRequestDto;
import Sale_Detail.Sale_Detail.dto.SaleDetailResponseDto;

import java.util.List;

public interface SaleDetailService {
    SaleDetailResponseDto findById(Long id);
    List<SaleDetailResponseDto> findAll();
    SaleDetailResponseDto create(SaleDetailRequestDto dto);
    SaleDetailResponseDto update(SaleDetailRequestDto dto);
    boolean deleteById(Long id);
}
