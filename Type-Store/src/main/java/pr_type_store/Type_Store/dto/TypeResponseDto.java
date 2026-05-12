package pr_type_store.Type_Store.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TypeResponseDto {
    public TypeResponseDto (Long id, String name){
        this.id= id;
        this.name = name;
    }

    @NotNull
    Long id;
    @NotBlank
    String name;


}
