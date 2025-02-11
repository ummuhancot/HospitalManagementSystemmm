package com.dev.hospitalmanagementsystem.entity.enims;
import lombok.Getter;

@Getter
public enum WorkTermType {//nöbet saatleri

    HAFTA_ICI_MESAI("Hafta İçi Mesaisi", "08:00 - 17:00 arasında çalışma"),
    HAFTA_SONU_MESAI("Hafta Sonu Mesaisi", "09:00 - 14:00 arasında çalışma"),
    GECENOBETI("Gece Nöbeti", "20:00 - 08:00 arasında nöbet"),
    BAYRAM_MESAI("Bayram/Nöbetçi Mesaisi", "Bayram ve tatil günlerinde tam gün çalışma"),
    GUNDUZ_NOBETI("Gündüz Nöbeti", "08:00 - 20:00 arasında nöbet"),
    YIRMIDORT_SAATLIK_NOBET("24 Saatlik Nöbet", "Tam 24 saat süren nöbet");

    private final String ad;
    private final String aciklama;

    WorkTermType(String ad, String aciklama) {
        this.ad = ad;
        this.aciklama = aciklama;
    }

}
