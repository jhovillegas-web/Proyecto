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
public class EmployeeResponseDto {
    public EmployeeResponseDto(Long id, Long id_store , String name, String lastName, String email, String phone) {
        this.id = id;
        this.id_store = id_store;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    @NotNull
    Long id;
    Long id_store;
    @NotBlank
    String name;
    @NotBlank
    String lastName;
    @Email
    String email;
    @NotBlank
    String phone;
}
