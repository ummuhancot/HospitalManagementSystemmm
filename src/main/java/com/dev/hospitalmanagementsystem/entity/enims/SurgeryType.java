package com.dev.hospitalmanagementsystem.entity.enims;

import lombok.Getter;

@Getter
public enum SurgeryType {//Ameliyat türü

    GENERAL_SURGERY("General Surgery"),          // Genel Cerrahi Ameliyatları
    CARDIAC_SURGERY("Cardiac Surgery"),          // Kalp ve Damar Cerrahisi
    NEUROSURGERY("Neurosurgery"),                // Beyin ve Sinir Cerrahisi
    ORTHOPEDIC_SURGERY("Orthopedic Surgery"),    // Ortopedik Cerrahi
    OPHTHALMIC_SURGERY("Ophthalmic Surgery"),    // Göz Ameliyatları
    ENT_SURGERY("ENT Surgery"),                  // Kulak Burun Boğaz Cerrahisi
    UROLOGICAL_SURGERY("Urological Surgery"),    // Ürolojik Ameliyatlar
    DERMATOLOGICAL_SURGERY("Dermatological Surgery"), // Cilt Cerrahisi
    GYNECOLOGICAL_SURGERY("Gynecological Surgery"),   // Jinekolojik Cerrahi
    PLASTIC_SURGERY("Plastic Surgery"),          // Plastik ve Estetik Cerrahi
    THORACIC_SURGERY("Thoracic Surgery"),        // Göğüs Cerrahisi
    VASCULAR_SURGERY("Vascular Surgery"),        // Damar Cerrahisi
    ABDOMINAL_SURGERY("Abdominal Surgery"),      // Karın Cerrahisi
    ONCOLOGIC_SURGERY("Oncologic Surgery");      // Kanser Cerrahisi

    private final String name;

    SurgeryType(String name) {
        this.name = name;
    }
}


/*

👨‍⚕️ SurgeryType (Ameliyat Türleri) Kimler İçin Geçerli Olmalıdır?
SurgeryType enumu, ameliyat türlerini tanımladığı için sadece ameliyatla ilgili tıbbi personel ve yönetim kadrosu tarafından kullanılmalıdır.

✅ SurgeryType Enum’una Erişmesi Gerekenler (Yetkili Kullanıcılar)
Bu roller, ameliyat planlaması ve yönetimiyle ilgilenir:

✔ Cerrahlar (DOCTOR) → Hangi ameliyat türünde uzman olduklarını belirlemek ve hasta için uygun ameliyatı seçmek için.
✔ Hemşireler (NURSE) → Ameliyat hazırlığı ve operasyon sırasında destek sağlamak için.
✔ Ameliyathane Personeli (SURGICAL_ASSISTANT) → Ameliyat sürecini koordine etmek için.
✔ Hastane Yöneticileri (ADMIN & MANAGER) → Cerrahi operasyonları planlamak ve yönetmek için.
✔ Anestezi Uzmanları (ANESTHESIOLOGIST) → Ameliyat sırasında hastaların anestezi yönetimini yapmak için.

🚫 SurgeryType Enum’una Erişmemesi Gerekenler (Yetkisiz Kullanıcılar)
Bu roller ameliyat planlamasıyla ilgilenmez:

❌ Hastalar (PATIENT) → Ameliyat türlerini sistemde görmelerine gerek yok, sadece doktorları yönlendirmeli.
❌ Resepsiyon Görevlileri (RECEPTIONIST) → Ameliyat planlaması yapmaz, randevu ve hasta kaydı yönetir.
❌ Temizlik ve Güvenlik Personeli (CLEANING_STAFF, SECURITY) → Ameliyathane hijyeni ve güvenliğiyle ilgilenir, ameliyat türleriyle ilgilenmez.
❌ Eczacılar (PHARMACIST) → Sadece ameliyat sırasında kullanılacak ilaç ve malzemelerle ilgilenir.



*/
