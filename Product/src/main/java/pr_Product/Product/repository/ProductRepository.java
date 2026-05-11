package pr_Product.Product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pr_Product.Product.model.Product;

public interface ProductRepository extends JpaRepository <Product, Long> {

}
