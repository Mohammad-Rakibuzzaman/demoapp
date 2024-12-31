package com.crixus.demoApplication;

import org.springframework.stereotype.Component;

@Component
public class Macmini implements Computer{

    public void compile() {
        System.out.println("Macmini running successfully....");
    }


}
