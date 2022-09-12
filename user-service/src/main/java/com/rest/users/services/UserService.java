package com.rest.users.services;

import com.rest.users.dtos.UserPayment;
import com.rest.users.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;


    public List<UserPayment> getUserPayments() {
        List<UserPayment>
    }
}
