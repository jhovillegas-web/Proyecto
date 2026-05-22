package Type_Employee.Type_Employee.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class TypeResponseDto {
    public TypeResponseDto (Long id, String name){
        this.id= id;
        this.name = name;
    }

    Long id;
    String name;
}
