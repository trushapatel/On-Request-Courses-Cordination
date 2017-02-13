package com.ocr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service("mailSenderService")
public class MailSenderServiceImpl implements MailSenderService {

    @Autowired
    private MailSender mailSender;

    @Value("${send.from.email}")
    private String fromEmail;

    @Override
    public void sendWelcomeEmail(String email,String registrationPin) {
        SimpleMailMessage templateMessage = new SimpleMailMessage();
        templateMessage.setSubject("Welcome to ORS");
        templateMessage.setFrom(this.fromEmail);
        templateMessage.setTo(email);

        SimpleMailMessage msg = new SimpleMailMessage(templateMessage);
        StringBuilder builder = new StringBuilder("You have successfully registered with ORS.").append("/n").append("Use this link ").append("localhost:8080/registration/verify?pin=").append(registrationPin).append(" to complete your registration.");
        msg.setText(builder.toString());
        mailSender.send(msg);
    }
}
