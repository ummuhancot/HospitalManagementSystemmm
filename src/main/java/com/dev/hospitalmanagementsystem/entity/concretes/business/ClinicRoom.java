package com.dev.hospitalmanagementsystem.entity.concretes.business;

import com.dev.hospitalmanagementsystem.entity.enims.MedicalDepartment;
import com.dev.hospitalmanagementsystem.entity.enims.SurgeryType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClinicRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clinicRoomName;

    @Enumerated(EnumType.STRING)
    private MedicalDepartment medicalDepartment;//tıp departmanı

    private String doctorName;//doktor adı
    private String medicalSecretary;//tibbi sekreter
    private String Nurse;//hemşire

    @Enumerated(EnumType.STRING)
    private SurgeryType surgeryType;//Ameliyat türü

    @JsonIgnore
    @ManyToMany(mappedBy = "clinicRooms")
    private Set<WorkProgram> workProgram;


}
