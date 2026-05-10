package com.aditi.payload.dto;

import com.aditi.domain.UserRole;
import lombok.Data;

@Data
public class UserDTO {

    private Long id;
    private String fullName;
    private String email;

}

