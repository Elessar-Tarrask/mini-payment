package kh.mini.payment.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginData {
    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
