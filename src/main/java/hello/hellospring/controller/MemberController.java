package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller    //1
public class MemberController {

    private final MemberService memberService;

    @Autowired   //2
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}