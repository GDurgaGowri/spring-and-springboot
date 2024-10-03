package com.example.spring.core.rest;

import org.springframework.stereotype.Component;

// without @component it has to configured
public class swimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice swiming for 15 minutes";
    }
}
