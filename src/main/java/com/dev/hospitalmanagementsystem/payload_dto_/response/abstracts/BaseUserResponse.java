package com.dev.hospitalmanagementsystem.payload_dto_.response.abstracts;

/*
* 4.video
* 48:21 dk sında kaldım
*/

import com.dev.hospitalmanagementsystem.entity.enims.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class BaseUserResponse {//cevap döndüreceğiz bu cevap objesi


    private Long id;
    private String username;
    private String name;
    private String surname;
    private LocalDate birthDay;
    private String ssn;
    private String birthPlace;
    private String phoneNumber;
    private String email;
    private Gender gender;
    private String userRole;


}
