package Employee.Employee.dto;

import jakarta.validation.constraints.Email;
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
public class EmployeeRequestDto {
    Long id;
    @NotBlank
    Long id_store;
    @NotBlank
    @Size(min = 1, max = 100)
    String name;

    @NotBlank
    @Size(min = 1, max = 100)
    String lastName;

    @Email(message = "Email debe ser un email válido")
    @NotBlank(message = "Email no debe estar vacío")
    String email;

    @NotBlank
    String phone;
}
