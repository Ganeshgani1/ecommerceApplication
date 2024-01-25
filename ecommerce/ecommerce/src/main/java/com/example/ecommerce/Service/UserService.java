package com.example.ecommerce.Service;

import com.example.ecommerce.Entity.User;
import com.example.ecommerce.Pojo.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface UserService {
    ApiResponse addUser(User userDetails);
}
