package com.example.server.models;

import jakarta.persistence.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "users")
public class Users {


    @Id
    private Long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @NotBlank
    @Size(max = 50)
    private String username;

    @NotBlank
    @Size(max = 120)
    private String password;

    @NotBlank
    @Size(max = 15)
    private String mobilenummer;

    @NotBlank
    @Email
    @Size(max = 100)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private Role role;

    public Users(Long id, String username, String password, String mobilenummer, String email, Role role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.mobilenummer = mobilenummer;
        this.email = email;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobilenummer() {
        return mobilenummer;
    }

    public void setMobilenummer(String mobilenummer) {
        this.mobilenummer = mobilenummer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(id, users.id) && Objects.equals(username, users.username) && Objects.equals(password, users.password) && Objects.equals(mobilenummer, users.mobilenummer) && Objects.equals(email, users.email) && role == users.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, mobilenummer, email, role);
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mobilenummer='" + mobilenummer + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }
}