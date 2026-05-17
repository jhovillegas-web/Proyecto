package Sale_Detail.Sale_Detail.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor

public class SaleDetailResponseDto {
    public SaleDetailResponseDto(Long id, Long id_sale, Long id_product, LocalDate date, Integer quantity){
        this.id = id;
        this.id_sale = id_sale;
        this.id_product = id_product;
        this.date = date;
        this.quantity = quantity;

    }


    Long id;
    @NotNull
    Long id_sale;
    @NotNull
    Long id_product;
    @NotBlank
    LocalDate date;
    Integer quantity;
}
