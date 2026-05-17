package Sale_Detail.Sale_Detail.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
@NoArgsConstructor
public class SaleDetailRequestDto {
    Long id;
    @NotNull
    Long id_sale;
    @NotNull
    Long id_product;
    @NotBlank
    LocalDate date;
    Integer quantity;
}
