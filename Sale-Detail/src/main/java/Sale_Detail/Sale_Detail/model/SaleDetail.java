package Sale_Detail.Sale_Detail.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Setter
@Getter
@NoArgsConstructor
public class SaleDetail {
    public SaleDetail(Long id, Long id_sale, Long id_product, LocalDate date, Integer quantity){
        this.id = id;
        this.id_sale = id_sale;
        this.id_product = id_product;
        this.date = date;
        this.quantity = quantity;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long id_sale;
    Long id_product;
    LocalDate date;
    Integer quantity;
}
