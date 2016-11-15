package br.com.bytecraft.contact.service;

import br.com.bytecraft.contact.model.Contact;
import br.com.bytecraft.contact.repository.ContactRepository;
import br.com.bytecraft.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private EmailService emailService;

    public void submit(Contact contact) {
        contactRepository.save(contact);
        sendEmail(contact);
    }

    public void sendEmail(Contact contact) {
        emailService.send(contact);
    }

}
