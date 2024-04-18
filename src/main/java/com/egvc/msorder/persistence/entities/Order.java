package com.egvc.msorder.persistence.entities;

import com.egvc.msorder.commons.entities.AbstractEntity;
import com.egvc.msorder.constant.ConstantApps;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true, exclude = {"cart"})
@Data
@Builder
public final class Order extends AbstractEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;



    @DateTimeFormat(pattern = ConstantApps.LOCAL_DATE_TIME_FORMAT)
    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @Column(name = "order_desc")
    private String orderDesc;

    @Column(name = "order_fee", columnDefinition = "decimal")
    private Double orderFee;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cart_id")
    private Cart cart;

}
