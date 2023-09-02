package com.application.boop.authentication.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="UserProfile",uniqueConstraints = @UniqueConstraint(columnNames = {"id","email"}))
public class User {
    @Column(name="name")
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="age")
    private int age;

    @Column(name = "parent_name")
    private String parentName;

    @Column(name="images", columnDefinition = "bytea[]")
    private List<Byte[]> images;

    @Column(name="traits", columnDefinition = "text[]")
    private List<String> traits;

    @Column(name="email")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public List<Byte[]> getImages() {
        return images;
    }

    public void setImages(List<Byte[]> images) {
        this.images = images;
    }

    public List<String> getTraits() {
        return traits;
    }

    public void setTraits(List<String> traits) {
        this.traits = traits;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
