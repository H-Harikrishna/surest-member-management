package com.surest.member_service.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class AuthRequest {
    @NotBlank(message = "User name is required")
    private String username;

    @NotBlank(message = "Password is required")
    private String password;
}
