package Sale_Detail.Sale_Detail.dto.Product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductResponseDto {
    Long id;
    String name;
    String type;
    String description;
}
