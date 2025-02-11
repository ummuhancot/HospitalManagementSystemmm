package com.dev.hospitalmanagementsystem.entity.concretes.business;

import com.dev.hospitalmanagementsystem.entity.concretes.user.User;
import com.dev.hospitalmanagementsystem.entity.enims.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatiendInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String diseaseName; // Hastanın mevcut hastalığının adı

    private String prescribedMedications; // Hastaya reçetelenen ilaçlar

    private String surgicalHistory; // Hastanın geçirdiği ameliyatlar

    private String doctorNotes; // Doktorun hastaya dair notları

    private LocalDate treatmentStartDate; // Tedaviye başlama tarihi

    private LocalDate treatmentEndDate; // Tedavi bitiş tarihi (varsa)

    private String currentCondition; // Hastanın mevcut durumu (iyi, kötü, stabil vb.)

    private String followUpCare; // Takip tedavisi veya kontrolleri

    @Enumerated(EnumType.STRING)
    private BloodType bloodType; // Hastanın Kan Grubu


    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus; // Hastanın Ödeme Durumu

    @Enumerated(EnumType.STRING)
    private AppointmentStatus appointmentStatus; // Hastanın Randevu Durumu


    @ManyToOne
    @JsonIgnore//doktor bilgisini geritrme demek
    private User doctor;//hastalık teşhisi kime ait

    @ManyToOne
    @JsonIgnore//hasta bilgisini getirme demek
    @JoinTable(
            name = "user_patient",
            joinColumns = @JoinColumn(name = "patiend_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private User patient;//hasta kim


    @ManyToOne
    private ClinicRoom clinicRoom;//hastanın kim ve hangi kılinikte tedavi olduğu

    @OneToOne
    private WorkTerm workTerm;//tedavi Dönemi


}
