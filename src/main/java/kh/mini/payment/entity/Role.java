package kh.mini.payment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import kh.mini.payment.entity.common.CommonAbstractEntity;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@EqualsAndHashCode
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Role extends CommonAbstractEntity {

    @Enumerated(EnumType.STRING)
    private ERole name = ERole.ROLE_USER;
}
