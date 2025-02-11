package com.dev.hospitalmanagementsystem.entity.enims;

import lombok.Getter;

@Getter
public enum AppointmentStatus {
    SCHEDULED("Scheduled"),//Planlandı
    CANCELLED("Cancelled"),//İptal Edildi
    COMPLETED("Completed"),//Tamamlandı
    RESCHEDULED("Rescheduled"),//Yeniden Planlandı
    NO_SHOW("No Show");//Gelmedi

    private final String status;

    AppointmentStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
