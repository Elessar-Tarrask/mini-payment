package kh.mini.payment.services;

import kh.mini.payment.entity.JwtBlackList;
import kh.mini.payment.repo.JwtBlackListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JwtBlackListService {

    @Autowired
    JwtBlackListRepo jwtBlackListRepo;

    public void createNewBlackListToken(String token) {
        jwtBlackListRepo.save(new JwtBlackList(token));
    }

    public Boolean checkIfTokenInBlackList(String token) {
        return jwtBlackListRepo.findByToken(token).isPresent();
    }
}
