package com.dev.hospitalmanagementsystem.entity.enims;

import lombok.Getter;

@Getter
public enum BloodType {
    A_POSITIVE("A+"),
    A_NEGATIVE("A-"),
    B_POSITIVE("B+"),
    B_NEGATIVE("B-"),
    O_POSITIVE("O+"),
    O_NEGATIVE("O-"),
    AB_POSITIVE("AB+"),
    AB_NEGATIVE("AB-");

    private final String type;

    BloodType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
