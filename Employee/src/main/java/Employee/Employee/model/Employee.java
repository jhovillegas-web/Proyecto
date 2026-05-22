package Employee.Employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor

public class Employee {
    public Employee(Long id, Long id_store , Long id_type, String name, String lastName, String email, String phone) {
        this.id = id;
        this.id_store = id_store;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long id_store;
    Long id_type;
    String name;
    String lastName;
    String email;
    String phone;
}
