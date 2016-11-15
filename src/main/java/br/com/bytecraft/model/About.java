package br.com.bytecraft.model;

import javax.persistence.*;

@Entity
@Table
public class About {

    @Id
    @GeneratedValue
    @Column(name = "about_us_id")
    private Long id;

    @Column(name = "about_us")
    private String aboutUs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAboutUs() {
        return aboutUs;
    }

    public void setAboutUs(String aboutUs) {
        this.aboutUs = aboutUs;
    }
}
