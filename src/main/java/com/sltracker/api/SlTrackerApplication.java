package com.sltracker.api;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
@Data
@Service

@SpringBootApplication
public class SlTrackerApplication {
    @Autowired
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    public User saveUser(User user){
        String encodedpassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedpassword);



    }

}
