package com.example.HW4_SpringBoot_React.controller;

import com.example.HW4_SpringBoot_React.controller.dto.request.CreateUserRequest;
import com.example.HW4_SpringBoot_React.controller.dto.request.UpdateUserRequest;
import com.example.HW4_SpringBoot_React.controller.dto.response.StatusResponse;
import com.example.HW4_SpringBoot_React.model.entity.User;
import com.example.HW4_SpringBoot_React.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/HW4/v1")
@CrossOrigin("*") //origins = "http://localhost:3000/"
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getUserList() {
        List<User> users = this.userService.getUserList();
        return users;
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id) {
        User user = this.userService.getUserById(id);
        return user;
    }

    @PostMapping("/user")
    public StatusResponse createUser(@RequestBody CreateUserRequest request) {
        try {
            String response = this.userService.createUser(request);
            return new StatusResponse(response);
        } catch (Exception e) {
            return new StatusResponse("Please enter right information, name should be letter, age should be number.");
        }
    }

    @PutMapping("/user")
    public StatusResponse updateUserById(@RequestBody UpdateUserRequest request) {
        try {
            String response = this.userService.updateUserById(request);
            return new StatusResponse(response);
        } catch (Exception e) {
            return new StatusResponse("Please enter right information, name should be letter, age should be number.");
        }

    }

    @DeleteMapping("/user/{id}")
    public StatusResponse deleteUserById(@PathVariable Long id) {
        this.userService.deleteUserById(id);
        return new StatusResponse("delete successfully.");
    }
}
