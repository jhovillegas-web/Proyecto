package Sales.Sales.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter
@Getter
@NoArgsConstructor
public class SalesResponseDto {
    public SalesResponseDto(Long id, Long id_client, Long id_store,  String total){
        this.id = id;
        this.id_client = id_client;
        this.id_store = id_store;
        this.total = total;

    }

    @NotNull
    Long id;
    @NotNull
    Long id_client;
    @NotNull
    Long id_store;
    @NotNull
    String total;
}
