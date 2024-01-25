package com.example.ecommerce.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.lang.NonNull;

import java.io.Serializable;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;
    @NonNull
    private String password;
    private String mobile;

    private Boolean recordDeleted=false;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public String getMobile() {
        return mobile;
    }

    public Boolean getRecordDeleted() {
        return recordDeleted;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setRecordDeleted(Boolean recordDeleted) {
        this.recordDeleted = recordDeleted;
    }

    public User(Long id, String name, String email, @NonNull String password, String mobile, Boolean recordDeleted) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.recordDeleted = recordDeleted;
    }
}
