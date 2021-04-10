package kh.mini.payment.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping("/add")
    private String testToken() {
        return "Success";
    }
}