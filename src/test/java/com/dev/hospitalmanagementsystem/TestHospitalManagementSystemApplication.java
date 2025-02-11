package com.dev.hospitalmanagementsystem;

import org.springframework.boot.SpringApplication;

public class TestHospitalManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.from(HospitalManagementSystemApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
