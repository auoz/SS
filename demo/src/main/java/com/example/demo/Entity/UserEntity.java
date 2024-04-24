package com.example.demo.Entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name="users")
public class UserEntity {
    @Id
    @Column(name="User_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @jakarta.persistence.Id
    private int userId;
    @Column(name="username", length = 255)
    private String username;
    @Column(name="email", length = 255)
    private String email;
    @Column(name="password", length = 255)
    private String password;

    public UserEntity() {
    }
    public UserEntity(int userId, String username, String email, String password) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
