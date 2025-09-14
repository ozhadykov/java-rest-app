package com.rest.app.setting_scores.coach;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println("Baseball Coach Initialzing");
    }

    @Override
    public String getDailyWorkout() {
        return "WORK HARD WITH BATE!";
    }
}
