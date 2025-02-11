package com.dev.hospitalmanagementsystem.entity.concretes.business;

import com.dev.hospitalmanagementsystem.entity.concretes.user.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MedicalBoardMeet {//Sağlık Kurulu toplantısı

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private List<String> participants; // Katılımcılar (Doktorlar, idari personel vb.)

    private String topic;       // Toplantının konusu (ör. Sağlık raporu değerlendirme)

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
    private LocalDate date;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "HH:mm",timezone = "US")
    private LocalTime startTime;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "HH:mm",timezone = "US")
    private LocalTime stopTime;

    private String location;    // Toplantının yapılacağı yer

    @ManyToOne(cascade = CascadeType.PERSIST)
    private User organizer;   // Toplantıyı düzenleyen kişi (ör. Başhekim)

    @ManyToMany
    @JoinTable(
            name = "meet_patiend_table",
            joinColumns = @JoinColumn(name = "meet_id"),
            inverseJoinColumns = @JoinColumn(name = "patiend_id")
    )
    private List<User> patiendList;//hasta listesi

}
