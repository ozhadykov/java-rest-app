package com.rest.app.setting_scores.config;

import com.rest.app.setting_scores.coach.Coach;
import com.rest.app.setting_scores.coach.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    // in a real world use here should be instantiated a third party class
    // which then with Bean annotation can be used and injected as a normal Bean
    // and you also can give a custom id for the bean which then is used in @Qualifier in constructor
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
