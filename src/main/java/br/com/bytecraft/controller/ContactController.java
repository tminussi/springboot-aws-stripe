package br.com.bytecraft.controller;

import br.com.bytecraft.model.Contact;
import br.com.bytecraft.service.ContactService;
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
