package pr_Owner.Owner.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OwnerResponseDto {
    public OwnerResponseDto(Long id, String name, String lastName, String email, String phone) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    @NotNull
    Long id;

    @NotBlank
    String name;
    @NotBlank
    String lastName;
    @Email
    String email;
    @NotBlank
    String phone;
}
