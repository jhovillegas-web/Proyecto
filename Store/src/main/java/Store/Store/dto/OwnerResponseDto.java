package Store.Store.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OwnerResponseDto {
    Long id;
    String name;
    String lastName;
    String email;
    String phone;
}
