package kh.mini.payment.repo;

import kh.mini.payment.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface WalletRepo extends JpaRepository<Wallet, Serializable> {
}
