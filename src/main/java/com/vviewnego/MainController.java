package com.vviewnego;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title", "테스트 페이지");
        model.addAttribute("msg","스프링 부트 테스트 프로젝트입니다.");
        return "index";
    }

}
