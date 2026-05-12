package pr_type_store.Type_Store.dto;

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
public class TypeRequestDto {
    Long id;

    @NotBlank
    @Size(min = 1, max = 100)
    String name;
}
