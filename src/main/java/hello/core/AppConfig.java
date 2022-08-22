package hello.core;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

/*
    애플리케이션의 실제 동작에 필요한 구현 객체를 생성
    생성한 객체 인스턴스의 레퍼런스를 생성자를 통해 주입한다
    객체의 생성과 연결을 담당함
    관심사의 분리 : 객체 생성하고 연결하는 역할과 실행하는 역할을 명확히 분리시킴
 */

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }


}
