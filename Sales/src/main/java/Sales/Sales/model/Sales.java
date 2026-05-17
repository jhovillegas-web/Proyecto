package Sales.Sales.model;

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
public class Sales {

    public Sales(Long id, Long id_client, Long id_store, String total){
        this.id = id;
        this.id_client = id_client;
        this.id_store = id_store;
        this.total = total;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long id_client;
    Long id_store;
    String total;
}
