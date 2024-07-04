package com.example.validation.Validationdemo.Controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jdk.nashorn.internal.objects.annotations.Getter;


public class Logindata {

    @NotBlank(message = "Username cannot be null")
    @Size(min = 2,max = 5, message = "username should be min 1 and max 4 char long")
    private String Username;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    @NotBlank(message = "Password cannot be empty")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Logindata{" +
                "Username='" + Username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
