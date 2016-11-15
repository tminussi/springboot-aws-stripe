package br.com.bytecraft.controller;

import br.com.bytecraft.model.About;
import br.com.bytecraft.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class AboutController {

    @Autowired
    private AboutService aboutService;

    @RequestMapping(value = "/aboutUs", method = RequestMethod.GET)
    public About about() {
        return aboutService.aboutUs();
    }
}
