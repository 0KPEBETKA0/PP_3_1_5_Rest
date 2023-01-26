package danil.shrimp.Rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import danil.shrimp.Rest.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
