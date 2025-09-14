package com.rest.app.setting_scores.coach;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    public CricketCoach() {
        System.out.println("Cricket Coach Initialzing");
    }

    // init method
    @PostConstruct
    public void postConstruct() {
        System.out.println("Cricket Coach initializing");
    }

    // destroy method
    @PreDestroy
    public void preDestroy() {
        System.out.println("Cricket Coach destroying");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for Cricket Coach!!!! ebana nos";
    }
}
