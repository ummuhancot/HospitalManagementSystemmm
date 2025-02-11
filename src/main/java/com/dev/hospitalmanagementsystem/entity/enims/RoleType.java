package com.dev.hospitalmanagementsystem.entity.enims;

import lombok.Getter;

@Getter
public enum RoleType {

  ADMIN("Administrator"),            // Yönetici
  CHIEF_PHYSICIAN("Chıef Physıcıan "),//Baş Hekim Hastane genelindeki toplantıları yönetir
  DOCTOR("Doctor"),                  // Doktor
  NURSE("Nurse"),                    // Hemşire
  PATIENT("Patient"),                // Hasta
  ACCOUNTANT("Accountant"),          // Muhasebeci
  MEDICAL_SECRETARY("Medical Secretary"); // Tıbbi Sekreter

  private final String name;

  RoleType(String name) {
    this.name = name;
  }
}

/*

🚀 RoleType Enum’una Kimler Erişmeli ve Ne Yapabilmeli?
RoleType enumu, hastanedeki kullanıcı rollerini tanımladığı için sadece yönetici ve yetkili teknik personel tarafından kullanılmalıdır.

✅ RoleType Enum’una Erişmesi Gerekenler (Yetkili Kullanıcılar)
Bu kullanıcılar yeni roller atayabilir, yetkilendirme yapabilir veya rol bazlı işlemleri yönetebilir:

1️⃣ Yönetim Kadrosu:
✔ Admin (ADMIN) → Tüm roller üzerinde yetkiye sahip olup, yeni roller atayabilir veya değiştirebilir.
✔ Muhasebeci (ACCOUNTANT) → Finansal işlemlerde kimlerin yetkili olduğunu belirleyebilir.
✔ Hastane Müdürü (MANAGER – Eğer eklenecekse) → Çalışan rolleri üzerinde yetkilendirme yapabilir.

2️⃣ Teknik Destek:
✔ Bilgi İşlem Ekibi (IT_SUPPORT – Eğer eklenecekse) → Kullanıcı rollerini yönetebilir, yetki kontrollerini ayarlayabilir.

🚫 RoleType Enum’una Erişmemesi Gerekenler (Yetkisiz Kullanıcılar)
Bu kullanıcılar sistemde rollerin değiştirilmesine veya yönetilmesine ihtiyaç duymaz:

❌ Doktorlar (DOCTOR) → Hasta tedavisiyle ilgilenir, yetkilendirme yapmaz.
❌ Hemşireler (NURSE) → Hasta bakımı yapar, kullanıcı rolleriyle ilgilenmez.
❌ Resepsiyon Görevlileri (RECEPTIONIST) → Hasta kayıtlarını yönetir, kullanıcı rolleriyle ilgilenmez.
❌ Laboratuvar Teknisyenleri (LAB_TECHNICIAN) → Test sonuçlarıyla ilgilenir, yetkilendirme yapmaz.
❌ Eczacılar (PHARMACIST) → İlaçları yönetir, sistemde rol değişikliği yapmaz.
❌ Hastalar (PATIENT) → Hiçbir şekilde bu enumu göremez veya kullanamaz.
❌ Temizlik ve Güvenlik Personeli (CLEANING_STAFF, SECURITY) → Sadece fiziksel güvenlik ve temizlikten sorumludur.

*/
