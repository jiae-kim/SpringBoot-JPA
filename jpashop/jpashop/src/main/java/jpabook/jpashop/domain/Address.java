package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable // JPA 내장타입
@Getter // 값 타입은 변경 불가능하게 설계해야 함, setter 제거
public class Address {

    private String city;
    private String street;
    private String zipcode;

    // 엔티티나 임베디드 타입은 자바 기본 생성자를 public 또는 protected로 설정
    // JPA가 제약을 두는 이유 : JPA 구현 라이브러리가 객체를 생성할 때 리플랙션 같은 기술을 사용할 수 있도록 지원해야 하기 때문
    protected Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

}
