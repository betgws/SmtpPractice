package com.example.smtp.controller;


import com.example.smtp.service.SmtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
public class SmtpController {

    @Autowired
    private SmtpService smtpService;

    @GetMapping("/send")
    public String sendEmail(@RequestParam String to) {
        smtpService.sendEmail(to, "테스트 메일", "이것은 Spring Boot로 보낸 이메일입니다.");
        return "이메일 전송 완료!";
    }
}

