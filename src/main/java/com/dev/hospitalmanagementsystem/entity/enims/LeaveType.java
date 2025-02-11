package com.dev.hospitalmanagementsystem.entity.enims;

import lombok.Getter;

@Getter
public enum LeaveType {

        // Yıllık izin: Çalışanların yıllık olarak kullandığı izin türü
        ANNUAL_LEAVE("Annual Leave"),

        // Hastalık izni: Çalışanın hastalandığı durumlarda aldığı izin türü
        SICK_LEAVE("Sick Leave"),

        // Doğum izni: Kadın çalışanların doğum yapması durumunda aldıkları izin türü
        MATERNITY_LEAVE("Maternity Leave"),

        // Ücretsiz izin: Çalışanın ücret almadan aldığı izin türü
        UNPAID_LEAVE("Unpaid Leave"),

        // Kişisel izin: Çalışanın kişisel sebeplerle aldığı izin türü
        PERSONAL_LEAVE("Personal Leave"),

        // Yeni yıl tatili
        NEW_YEAR("New Year"),

        // Ulusal bayram tatili
        NATIONAL_DAY("National Day"),

        // Dini bayram tatili
        RELIGIOUS_HOLIDAY("Religious Holiday"),

        // Hafta sonu tatili
        WEEKEND("Weekend"),

        // Özel izin: Belirli durumlarda verilen özel izin türü
        SPECIAL_LEAVE("Special Leave");

        private final String value;

        // Constructor: EmployeeLeaveType enum'ını belirli bir değerle başlatmak için kullanılır
        LeaveType(String value) {
            this.value = value;
        }

        // Getter metodu: EmployeeLeaveType'ın değerini döndürmek için kullanılır
        public String getValue() {
            return value;
        }

}

