package br.com.bytecraft.service;

import br.com.bytecraft.model.About;
import br.com.bytecraft.repository.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.google.common.collect.Lists.newArrayList;

@Service
public class AboutService {

    @Autowired
    private AboutRepository aboutRepository;

    public About aboutUs() {
        save();
        return newArrayList(aboutRepository.findAll())
                .stream()
                .findAny()
                .get();
    }

    @Transactional
    public void save() {
        About about = new About();
        about.setAboutUs("We are a company that...");
        aboutRepository.save(about);
    }
}
