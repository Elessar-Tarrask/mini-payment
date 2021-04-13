package kh.mini.payment.controller;

import kh.mini.payment.dto.TransactionDTO;
import kh.mini.payment.services.TransactionService;
import kh.mini.payment.services.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping()
public class PaymentController {

    @Autowired
    TransactionService transactionService;

    @GetMapping("payment")
    private TransactionDTO testToken() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        return transactionService.makeTransaction(userDetails.getId());
    }
}
