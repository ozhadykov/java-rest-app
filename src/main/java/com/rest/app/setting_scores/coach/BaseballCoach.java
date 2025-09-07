package com.rest.app.setting_scores.coach;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "WORK HARD WITH BATE!";
    }
}
