package com.anna.serverless.notificationservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@AllArgsConstructor
@RestController("/notification")
public class MailSender {

    @Autowired
    private JavaMailSender javaMailSender;

    @RequestMapping("/sendEmail")
    public void sedEmail(){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(Constants.CUSTOMER_EMAIL);
        this.javaMailSender.send(message);
    }
}
