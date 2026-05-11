package pr_Product.Product.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestDto {
    Long id;

    @NotBlank
    @Size(min = 1, max = 100)
    String name;
    @NotBlank
    String type;
    String description;

}
