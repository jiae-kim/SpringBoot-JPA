package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    // 저장 코드
    public Long save(Member member) {
        em.persist(member);
        return member.getId(); // 아이디만 반환하는 이유 : command와 쿼리 분리
    }

    // 조회
    public Member find(Long id) {
        return em.find(Member.class, id);
    }
}
