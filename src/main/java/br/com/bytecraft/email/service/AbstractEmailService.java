package br.com.bytecraft.email.service;

import br.com.bytecraft.contact.model.Contact;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

public abstract class AbstractEmailService implements EmailService {

    @Value("${default.to.address}")
    private String to;

    protected SimpleMailMessage prepareSimpleMailMessage(Contact contact) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setFrom(contact.getEmail());
        message.setSubject("New message received from " + contact.getName());
        message.setText(contact.getMessage());
        return message;
    }

    @Override
    public void send(Contact contact) {
        sendGenericEmailMessage(prepareSimpleMailMessage(contact));
    }

}
