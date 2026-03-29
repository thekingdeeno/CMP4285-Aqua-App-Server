package com.example.aqua.models;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String user_id;
    private String name;
    @JsonIgnore
    private String password;
    private String email;

    public User() {
        this.user_id = java.util.UUID.randomUUID().toString().replace("-", "").substring(0, 20);
    }

    public void setName(String name) { this.name = name; }
    public void setPassword(String password) { this.password = password; }
    public void setEmail(String email) { this.email = email; }
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getPassword() { return password; }
    public String getEmail() { return email; }
}