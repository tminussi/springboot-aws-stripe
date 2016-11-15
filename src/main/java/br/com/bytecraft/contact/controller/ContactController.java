package br.com.bytecraft.contact.controller;

import br.com.bytecraft.contact.model.Contact;
import br.com.bytecraft.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @ResponseBody
    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public void submitContactForm(@RequestBody Contact contact) {
        contactService.submit(contact);
    }
}
