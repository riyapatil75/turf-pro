package com.example.TurfPro.dto;

import lombok.Data;

@Data
public class UserRequestDto {
        private String name;
        private String password;
        private String phone;
        private String email;
        private Long role;


}
