package kh.mini.payment.dto;

import kh.mini.payment.entity.Transaction;
import kh.mini.payment.entity.Wallet;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransactionDTO {
    private Transaction transaction;

    private Wallet wallet;
}
