package Sale_Detail.Sale_Detail.dto.Sale;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class SaleResponseDto {
    Long id;
    Long id_client;
    Long id_store;
    String total;
}
