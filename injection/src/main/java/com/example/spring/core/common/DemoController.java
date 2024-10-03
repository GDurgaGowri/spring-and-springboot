package com.example.spring.core.common;

import com.example.spring.core.rest.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;

    // define a constructor injection
    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach theCoach) { //qualifiers to avoid confusion for spring bean
        myCoach = theCoach;
    }

    //defining a setter injection
//    @Autowired
//    public void setMyCoach(Coach theCoach){
//        myCoach=theCoach;
//    }

    @GetMapping("/")
    public String Controller() {
        return "Hi";
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}