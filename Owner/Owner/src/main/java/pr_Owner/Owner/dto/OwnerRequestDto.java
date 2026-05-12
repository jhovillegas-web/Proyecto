package pr_Owner.Owner.dto;

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
public class OwnerRequestDto {
    Long id;

    @NotBlank
    @Size(min = 1, max = 100)
    String name;

    @NotBlank
    @Size(min = 1, max = 100)
    String lastName;

    @Email(message = "Debe ser un email válido")
    @NotBlank(message = "Email no debe estar vacío")
    String email;

    @NotBlank
    String phone;
}
