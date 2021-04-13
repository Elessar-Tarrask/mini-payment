package kh.mini.payment.services;

import kh.mini.payment.exception.*;
import kh.mini.payment.dto.TransactionDTO;
import kh.mini.payment.entity.Currency;
import kh.mini.payment.entity.Transaction;
import kh.mini.payment.entity.Wallet;
import kh.mini.payment.repo.TransactionRepo;
import kh.mini.payment.repo.UserRepo;
import kh.mini.payment.repo.WalletRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.UUID;

@Service
public class TransactionService {

    @Autowired
    WalletRepo walletRepo;

    @Autowired
    UserRepo userRepository;

    @Autowired
    TransactionRepo transactionsRepo;

    @Transactional
    public TransactionDTO makeTransaction(UUID userID) {
        Wallet wallet = userRepository.findById(userID).map(user -> user.getWallet()).orElseThrow(() -> new ApiRequestException("no Wallet"));

        Transaction transaction = new Transaction(BigDecimal.valueOf(1.1), UUID.randomUUID().toString().split("-")[0], Currency.USD);
        wallet.setAmount(wallet.getAmount().subtract(transaction.getTrsAmount()));

        if (wallet.getAmount().signum() < 0) {
            throw new ApiRequestException("insufficient fund ... ");
        }

        walletRepo.save(wallet);

        transaction.setWalletID(wallet.getId());

        transactionsRepo.save(transaction);

        return new TransactionDTO(transaction, wallet);
    }
}
