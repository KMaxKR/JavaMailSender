package ks.msx.JavaMailSender.controller;

import ks.msx.JavaMailSender.email.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class MainController {
    private final EmailService service;

    @RequestMapping("/send")
    @EventListener(ApplicationReadyEvent.class)
    public String sendEmail(){
        service.sendEmail("maxcresciuc@gmail.com", "Test", "Test");
        return "done";
    }
}
