package com.rest.app.setting_scores.coach;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice for Cricket Coach!!!! ebana nos";
    }
}
