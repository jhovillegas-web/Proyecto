package Store.Store.dto;

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
public class StoreRequestDto {


    Long id;
    Long id_owner;
    Long id_type;
    @NotBlank
    @Size(min = 1, max = 100)
    String name;
}
