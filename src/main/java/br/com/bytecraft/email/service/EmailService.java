package br.com.bytecraft.email.service;

import br.com.bytecraft.contact.model.Contact;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

public interface EmailService {

    void send(Contact contact);

    void sendGenericEmailMessage(SimpleMailMessage simpleMailMessage);
}
