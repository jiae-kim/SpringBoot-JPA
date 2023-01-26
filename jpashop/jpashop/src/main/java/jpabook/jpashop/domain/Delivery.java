package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
@Getter @Setter
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery", fetch = LAZY) // 하나의 배송은 하나의 주문정보
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING) // ORDINAL 절대 금지
    private DeliveryStatus status; // READY, COMP
}
