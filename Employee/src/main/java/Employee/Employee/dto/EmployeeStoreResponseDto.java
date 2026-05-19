package Employee.Employee.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmployeeStoreResponseDto {
    Long id;
    String name;
    String lastName;
    String email;
    String phone;
    private StoreResponseDto store;
}
