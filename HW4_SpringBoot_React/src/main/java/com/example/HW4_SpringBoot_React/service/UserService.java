package com.example.HW4_SpringBoot_React.service;

import com.example.HW4_SpringBoot_React.controller.dto.request.CreateUserRequest;
import com.example.HW4_SpringBoot_React.controller.dto.request.UpdateUserRequest;
import com.example.HW4_SpringBoot_React.model.UserRepository;
import com.example.HW4_SpringBoot_React.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUserList() {
        List<User> responses = userRepository.findAll();
        return responses;
    }

    public User getUserById(Long id) {
        Optional<User> optionalUser = this.userRepository.findById(id);
        if (optionalUser.isPresent()) {
            return optionalUser.get();
        } else {
            return null;
        }
    }

    public String createUser(CreateUserRequest request) {
        if(request.getName().isBlank()){
            return "Name should not be blank.";
        }

        if(request.getAge() == 0){
            return "Age should not be blank.";
        }

        User user = new User();
        user.setName(request.getName());
        user.setAge(request.getAge());
        this.userRepository.save(user);
        return "User data added successfully.";
    }

    public String updateUserById(UpdateUserRequest request) {

        if(request.getName().isBlank()){
            return "name should not be blank.";
        }

        if(request.getAge() == 0){
            return "age should not be blank.";
        }

        Optional<User> optionalUser = this.userRepository.findById(request.getId());

        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setName(request.getName());
            user.setAge(request.getAge());

            this.userRepository.save(user);
            return " data updated successfully.";
        } else {
            return " data updated unsuccessfully.";
        }

        //注釋原因，id為自動產生，且從前端抓取，也沒有開放給使用者填寫，所以不會為null
//        if (null == user) {
//            return "Fail";
//        }

    }

    public void deleteUserById(Long id) {
        User user = this.userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException());

        this.userRepository.deleteById(id);
    }
}
