package kh.mini.payment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kh.mini.payment.entity.common.CommonAbstractEntity;
import lombok.*;
import org.hibernate.annotations.Columns;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import java.util.Date;

@EqualsAndHashCode
@Data
@Entity
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@RequiredArgsConstructor
public class JwtBlackList extends CommonAbstractEntity {

    @Column(length = 2000)
    @NonNull
    private String token;

    @CreatedDate
    @JsonIgnore
    private Date date;
}
