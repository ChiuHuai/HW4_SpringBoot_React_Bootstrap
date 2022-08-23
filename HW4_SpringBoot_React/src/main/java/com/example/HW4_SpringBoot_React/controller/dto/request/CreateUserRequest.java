package com.example.HW4_SpringBoot_React.controller.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {
//    private int id;
    private String name;
    private int age;
}
