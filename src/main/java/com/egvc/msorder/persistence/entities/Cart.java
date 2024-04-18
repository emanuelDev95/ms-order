package com.egvc.msorder.persistence.entities;

import com.egvc.msorder.commons.entities.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "carts")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true, exclude = {"orders"})
@Data
@Builder
public final class Cart extends AbstractEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "user_id")
    private Integer userId;

    @OneToMany(mappedBy = "cart", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Order> orders;

}
