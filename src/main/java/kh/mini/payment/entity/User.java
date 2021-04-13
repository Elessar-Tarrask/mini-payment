package kh.mini.payment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kh.mini.payment.entity.common.CommonAbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "usr")
@NoArgsConstructor
@AllArgsConstructor
public class User extends CommonAbstractEntity {

    @Column(nullable = false, unique = true)
    private String username;
    @JsonIgnore
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public User(String username, String password) {
        this.password = password;
        this.username = username;
        this.wallet = new Wallet();
        this.wallet.setCurrency(Currency.USD);
        this.wallet.setAmount(BigDecimal.valueOf(8.0));
        this.wallet.setTransactions(new ArrayList<>());
    }

    @JsonIgnore
    private Wallet wallet;
}
