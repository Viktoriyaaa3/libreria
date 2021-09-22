package com.example.libreria.model;


import javax.persistence.*;

@Entity
@Table(name="Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "username", nullable= false)
    private String usename;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "email", nullable = true)
    private String email;


    public Users() {
    }

    public Users(Long id, String usename, String password, String email) {
        this.id = id;
        this.usename = usename;
        this.password = password;
        this.email = email;
    }

    public Users(String username, String password) {
        this.usename=username;
        this.password=password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
