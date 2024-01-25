package com.example.ecommerce.Controller;

import com.example.ecommerce.Entity.User;
import com.example.ecommerce.Pojo.ApiResponse;
import com.example.ecommerce.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<?> addUser(
            @RequestBody User userDetails
            ){
        ApiResponse response= new ApiResponse();
        response=userService.addUser(userDetails);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
