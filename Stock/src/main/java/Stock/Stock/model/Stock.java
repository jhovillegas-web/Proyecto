package Stock.Stock.model;

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
public class Stock {
    public Stock (Long id, Long id_product, Long id_store, Float price, Integer quantity, String status ){
        this.id= id;
        this.id_product = id_product;
        this.id_store = id_store;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long id_product;
    Long id_store;
    Float price;
    Integer quantity;
    String status;



}
