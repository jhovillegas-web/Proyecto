package Sale_Detail.Sale_Detail.dto;

import Sale_Detail.Sale_Detail.dto.Client.ClientResponseDto;
import Sale_Detail.Sale_Detail.dto.Product.ProductResponseDto;
import Sale_Detail.Sale_Detail.dto.Sale.SaleResponseDto;
import Sale_Detail.Sale_Detail.dto.Store.StoreResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AllResponseDto {
    Long id;
    SaleResponseDto sale;
    ClientResponseDto client;
    StoreResponseDto store;
    ProductResponseDto product;
    LocalDate date;
    Integer quantity;


}
