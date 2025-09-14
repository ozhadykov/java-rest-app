package com.rest.app.setting_scores.coach;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{
    public CricketCoach() {
        System.out.println("Cricket Coach Initialzing");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for Cricket Coach!!!! ebana nos";
    }
}
