package kh.mini.payment.repo;

import kh.mini.payment.entity.JwtBlackList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Optional;

@Repository
public interface JwtBlackListRepo extends JpaRepository<JwtBlackList, Serializable> {

    Optional<JwtBlackList> findByToken(String token);
}
