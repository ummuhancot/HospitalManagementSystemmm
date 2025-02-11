package com.dev.hospitalmanagementsystem.entity.concretes.business;

import com.dev.hospitalmanagementsystem.entity.concretes.user.User;
import com.dev.hospitalmanagementsystem.entity.enims.WorkTermType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WorkProgram {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private WorkTermType workTerm;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "HH:mm",timezone = "US")
    private LocalTime startTime;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "HH:mm",timezone = "US")
    private LocalTime stopTime;

    @ManyToMany
    @JoinTable(
            name = "treatment_program_treatment",
            joinColumns =@JoinColumn(name ="treatmentprogram_id"),
            inverseJoinColumns = @JoinColumn (name = "treatment_id")
    )
    private Set<ClinicRoom> clinicRooms;

    @ManyToOne//bircok worktems birtade calışana baglı
    private WorkTerm workTerms;

    @JsonIgnore
    @ManyToMany(mappedBy = "workProgramsList",fetch = FetchType.EAGER)
    private Set<User> users;

    @PreRemove
    private void removeWorkFromUser(){
        users.forEach(user -> user.getWorkProgramsList().remove(this));
    }

}
