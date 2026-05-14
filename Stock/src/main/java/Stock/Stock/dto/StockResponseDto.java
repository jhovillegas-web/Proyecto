package Stock.Stock.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StockResponseDto {

    public StockResponseDto (Long id, Long id_product, Long id_store, Float price, Integer quantity, String status ){
        this.id= id;
        this.id_product = id_product;
        this.id_store = id_store;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
    }


    @NotNull
    Long id;
    @NotNull
    Long id_product;
    @NotNull
    Long id_store;
    @NotNull
    Float price;
    @NotBlank
    Integer quantity;
    String status;
}
