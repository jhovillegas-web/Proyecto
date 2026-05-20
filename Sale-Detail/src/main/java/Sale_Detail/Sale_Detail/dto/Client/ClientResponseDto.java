package Sale_Detail.Sale_Detail.dto.Client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ClientResponseDto {
    Long id;
    String name;
    String lastName;
    String email;
    String phone;
}
