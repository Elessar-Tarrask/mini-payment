package kh.mini.payment.repo;

import kh.mini.payment.entity.ERole;
import kh.mini.payment.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
