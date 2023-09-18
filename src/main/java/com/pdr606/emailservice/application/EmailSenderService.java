package com.pdr606.emailservice.application;

import com.pdr606.emailservice.adapters.EmailSenderGateway;
import com.pdr606.emailservice.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGetaway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGetaway){
        this.emailSenderGetaway = emailSenderGetaway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGetaway.sendEmail(to, subject, body);

    }
}
