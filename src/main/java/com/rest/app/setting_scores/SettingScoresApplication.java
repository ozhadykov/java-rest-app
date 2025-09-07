package com.rest.app.setting_scores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (
		scanBasePackages = {"com.rest.app.util"}
)
public class SettingScoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(SettingScoresApplication.class, args);
	}

}
