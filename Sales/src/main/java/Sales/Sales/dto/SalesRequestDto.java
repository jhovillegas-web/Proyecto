package Sales.Sales.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter
@Getter
@NoArgsConstructor
public class SalesRequestDto {


    Long id;
    @NotNull
    Long id_client;
    @NotNull
    Long id_store;
    @NotNull
    String total;
}
