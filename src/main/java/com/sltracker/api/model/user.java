package com.sltracker.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Table(name= "users")
@Data


public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Username can't be left empty.")
    @Column(nullable=false, unique=true)
    private String username;

    @NotBlank(message="E-mail can't be left empty.")
    @Email(message = "Please enter a valid email.")
    @Column(nullable=false, unique=true)
    private String email;

    @NotBlank(message="Password can't be left empty.")
    @Column(nullable=false, unique=false)
    @Size(min = 8, max=20, message = "Password should be 8 characters at least and 20 at max.")
    @Pattern(
            regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$",
            message = "Password should contain at least one uppercase, lowercase, number and a special character."
    )
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;






}
