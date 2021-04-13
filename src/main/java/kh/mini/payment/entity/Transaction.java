package kh.mini.payment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kh.mini.payment.entity.common.CommonAbstractEntity;
import lombok.*;
import org.hibernate.dialect.CUBRIDDialect;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Transaction extends CommonAbstractEntity {


    @NonNull
    private BigDecimal trsAmount;
    @NonNull
    private String trsNo;
    @NonNull
    private Currency currency;

    @JsonIgnore
    private UUID walletID;

    @CreatedDate
    @JsonIgnore
    private Date createdDate;

}
