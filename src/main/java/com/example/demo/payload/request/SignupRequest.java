package com.example.demo.payload.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 50)
    private String username;
 
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    @NotBlank
    @Size(min = 3, max = 255)
    private String password;

    private Set<String> role;
}
