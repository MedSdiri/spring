package com.cydeo;

import org.springframework.stereotype.Component;

@Component
public class Java {

    OfficeHours officehours;

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours : "+ (20 + officehours.getHours()));
    }


}
