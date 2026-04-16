package com.example.TurfPro.dto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserResponseDto {
        private Long userId;
        private String name;
        private String phone;
        private String email;
        private LocalDateTime createdAt;
        private String role;

    }
