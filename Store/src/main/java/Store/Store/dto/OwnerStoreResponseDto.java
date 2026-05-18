package Store.Store.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OwnerStoreResponseDto {
    private Long id;
    private String name;
    private OwnerResponseDto owner;


}
