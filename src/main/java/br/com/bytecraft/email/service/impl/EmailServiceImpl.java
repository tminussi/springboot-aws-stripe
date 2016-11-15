package br.com.bytecraft.email.service.impl;

import br.com.bytecraft.email.service.AbstractEmailService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl extends AbstractEmailService {

    @Override
    public void sendGenericEmailMessage(SimpleMailMessage simpleMailMessage) {
        System.out.print("Testando");
    }
}
