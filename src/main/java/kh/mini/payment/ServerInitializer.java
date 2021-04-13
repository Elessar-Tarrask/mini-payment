package kh.mini.payment;

import kh.mini.payment.controller.AuthController;
import kh.mini.payment.dto.SignUpData;
import kh.mini.payment.entity.Role;
import kh.mini.payment.repo.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ServerInitializer implements ApplicationRunner {

    @Autowired
    AuthController authController;

    @Autowired
    RoleRepo roleRepository;

    @Override
    public void run(ApplicationArguments args) {

        roleRepository.save(new Role());

        authController.registerUser(new SignUpData("Elessar", "Elessar123"));
    }
}
