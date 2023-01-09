package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded // 내장타입 포함
    private Address address;

    @OneToMany(mappedBy = "member") // Member입장에서 일대다 관계
    // mappedBy : order테이블에 있는 member필드에 의해 맵핑됨 == 읽기전용
    private List<Order> orders = new ArrayList<>();

}
