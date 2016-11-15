package br.com.bytecraft.service;

import br.com.bytecraft.model.Contact;
import br.com.bytecraft.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public void submit(Contact contact) {
        System.out.println(contact);
    }

}
