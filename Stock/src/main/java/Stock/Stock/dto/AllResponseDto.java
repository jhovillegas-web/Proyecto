package Stock.Stock.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AllResponseDto {
    private Long id;
    private Float price;
    private Integer quantity;
    private String status;
    private ProductResponseDto product;
    private StoreResponseDto store;
}
