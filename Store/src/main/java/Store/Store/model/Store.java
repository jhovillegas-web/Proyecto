package Store.Store.model;

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
public class Store {
    public Store (Long id, Long id_owner, Long id_type, String name ){
        this.id= id;
        this.id_owner = id_owner;
        this.id_type = id_type;
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long id_owner;
    Long id_type;
    String name;
}
