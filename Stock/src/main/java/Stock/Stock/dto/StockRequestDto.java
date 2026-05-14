package Stock.Stock.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StockRequestDto {

    Long id;
    Long id_product;
    Long id_store;
    @NotBlank
    Float price;
    Integer quantity;
    String status;
}
