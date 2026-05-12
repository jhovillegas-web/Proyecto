package pr_type_store.Type_Store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pr_type_store.Type_Store.model.Type_store;

public interface TypeRepository extends JpaRepository<Type_store, Long> {
}
