package com.dev.hospitalmanagementsystem.entity.enims;

import lombok.Getter;

@Getter
public enum MedicalDepartment {

    // Acil Servis Bölümleri
    RED_ZONE("Red Zone"), // Kırmızı Alan - Hayati tehlikesi olan hastalar
    YELLOW_ZONE("Yellow Zone"), // Sarı Alan - Acil müdahale gerektiren ancak hayati tehlikesi olmayan hastalar
    GREEN_ZONE("Green Zone"), // Yeşil Alan - Hafif yaralanmalar ve acil olmayan durumlar

    // Hastane Bölümleri
    EMERGENCY("Emergency"), // Acil Servis
    RADIOLOGY("Radiology"), // Radyoloji
    SURGERY("Surgery"), // Cerrahi

    // Tıbbi Klinikler
    INTERNAL_MEDICINE("Internal Medicine"), // Dahiliye
    CARDIOLOGY("Cardiology"), // Kardiyoloji
    ORTHOPEDICS("Orthopedics"), // Ortopedi
    NEUROLOGY("Neurology"), // Nöroloji
    OPHTHALMOLOGY("Ophthalmology"), // Göz Hastalıkları
    ENT("Ear, Nose, and Throat"), // Kulak Burun Boğaz
    UROLOGY("Urology"), // Üroloji
    DERMATOLOGY("Dermatology"), // Dermatoloji
    GENERAL_SURGERY("General Surgery"), // Genel Cerrahi
    PEDIATRICS("Pediatrics"), // Çocuk Hastalıkları
    PHYSICAL_THERAPY("Physical Therapy"), // Fizik Tedavi
    PSYCHIATRY("Psychiatry"), // Psikiyatri
    ENDOCRINOLOGY("Endocrinology"), // Endokrinoloji
    PULMONOLOGY("Pulmonology"), // Göğüs Hastalıkları
    GYNECOLOGY("Gynecology"), // Jinekoloji
    ONCOLOGY("Oncology"); // Onkoloji

    private final String name;

    MedicalDepartment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
