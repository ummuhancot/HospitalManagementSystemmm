package com.dev.hospitalmanagementsystem.payload_dto_.request.abstracts;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder//kullandınız kılasın perinlarını yada childlarınıda buna eklemiş oluyoruz
//AbstractUserRequest sınıfının icindekileri de kullanabilicem
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseUserRequest extends AbstractUserRequest{

    @NotNull(message = "Please enter your username")
    @Size(min = 4, max = 16,message = "Your username should be at least 4-16 characters")
    private String password;


    private Boolean buildIn= false;

}

