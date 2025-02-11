package com.dev.hospitalmanagementsystem.entity.concretes.user;

import com.dev.hospitalmanagementsystem.entity.concretes.business.MedicalBoardMeet;
import com.dev.hospitalmanagementsystem.entity.concretes.business.PatiendInfo;
import com.dev.hospitalmanagementsystem.entity.concretes.business.WorkProgram;
import com.dev.hospitalmanagementsystem.entity.enims.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//PostgreSQL'de user anahtar kelimesi rezerve edilmiş bir kelimedir ve tablo adı olarak kullanılamaz.
// Bu nedenle, user tablosunu oluştururken veya ona referans verirken tablo adını tırnak işaretleri içinde
// kullanmanız gerekmektedir. Bu, PostgreSQL'in user kelimesini bir anahtar kelime olarak değil,
// bir tablo adı olarak tanımasını sağlar.
@Table(name = "\"user\"")// @Table(name = "user")Bu kullanım, PostgreSQL'in user kelimesini bir anahtar kelime olarak algılamasına neden olur ve bu da bir sözdizimi hatasına yol açar.
// mevcut alanlar ve yöntemler
//Bu kullanım, PostgreSQL'in user kelimesini bir tablo adı olarak tanımasını sağlar ve hatayı önler.
public class User {
    // existing fields and methods


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String ssn;

    private String name;
    private String surname;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    private String birthplace;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @Column(unique = true)
    private String phoneNumber;

    @Column(unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private BloodType bloodType;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private MedicalDepartment medicalDepartment;//doktor icin

    @Enumerated(EnumType.STRING)
    private SurgeryType surgeryType;//hangi ameliyat da görevli

    private Boolean buildIn;
    private String mothername;
    private String fathername;
    private boolean isActive;

    private int patiendNumber;//hasta
    private Long norseNumber;//hemşire
    private Long accountant;// Muhasebeci
    private Long chiefphysicianNumber;//başhekim
    private Long medicalSecretary;//tıbbi sekreter
    private Long advisorDoctorId;//doktor



    @OneToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private UserRole userRole;

    @OneToMany(mappedBy = "doctor",cascade = CascadeType.REMOVE)
    private List<PatiendInfo> patiendInfos;


    @ManyToMany
    @JoinTable(
            name = "user_workprogram",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "workprogram_id")
    )
    private Set<WorkProgram> workProgramsList;


    @JsonIgnore
    @ManyToMany(mappedBy ="patiendList")
    private List<MedicalBoardMeet> medicalBoardMeetList;




}
