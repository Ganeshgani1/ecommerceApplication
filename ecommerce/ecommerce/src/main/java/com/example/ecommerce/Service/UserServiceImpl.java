package com.example.ecommerce.Service;

import com.example.ecommerce.Entity.User;
import com.example.ecommerce.Pojo.ApiResponse;
import com.example.ecommerce.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;
    @Override
    public ApiResponse addUser(User userDetails) {
        ApiResponse response= new ApiResponse();
        if(userDetails.getPassword()!=null){
           User details=userRepo.save(userDetails);
           if(details.getId()!= null && details.getId()!=0){
               response.setData(details);
               response.setStatus(String.valueOf(HttpStatus.OK));
               response.setMessage("Success");
           }else{
               response.setData(details);
               response.setStatus(String.valueOf(HttpStatus.OK));
               response.setMessage("fail");
           }
        }
        return response;
    }
}
