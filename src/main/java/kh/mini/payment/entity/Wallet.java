package kh.mini.payment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kh.mini.payment.entity.common.CommonAbstractEntity;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
public class Wallet extends CommonAbstractEntity {

    private BigDecimal amount;

    private Currency currency;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "walletID")
    private List<Transaction> transactions;
}
