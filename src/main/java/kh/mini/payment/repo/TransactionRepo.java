package kh.mini.payment.repo;

import kh.mini.payment.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Serializable> {
}
