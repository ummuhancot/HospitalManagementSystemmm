package com.dev.hospitalmanagementsystem.entity.enims;

import lombok.Getter;

@Getter
public enum PaymentStatus {//ödeme durumu
    PENDING("Pending"),//Beklemede
    PAID("Paid"),//Ödendi
    FAILED("Failed"),//Başarısız
    REFUNDED("Refunded");//İade Edildi

    private final String status;

    PaymentStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
