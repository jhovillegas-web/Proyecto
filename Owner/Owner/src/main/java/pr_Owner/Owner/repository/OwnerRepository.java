package pr_Owner.Owner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pr_Owner.Owner.model.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
