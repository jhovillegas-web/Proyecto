package Store.Store.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class StoreResponseDto {

    public StoreResponseDto (Long id, Long id_owner, Long id_type, String name ){
        this.id= id;
        this.id_owner = id_owner;
        this.id_type = id_type;
        this.name = name;
    }

    @NotNull
    Long id;
    @NotNull
    Long id_owner;
    @NotNull
    Long id_type;
    @NotBlank
    String name;
}
