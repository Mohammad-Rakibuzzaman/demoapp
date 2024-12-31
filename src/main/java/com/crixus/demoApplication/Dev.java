package com.crixus.demoApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

//    Laptop laptop = new Laptop(); // one way to declare

    // we also can private our instance variable and use getters and setters
    // empty constructor or inside of constructor
    //to not to call again or invoking our applicationcontext again like demoApplication.java file

    @Autowired //field injection
//    @Qualifier("laptop")
    @Qualifier("macmini")
//    private Laptop laptop;
    private Computer comp; //best practice to creating a interface because here we are using different machine (lap, mac etc)



    //contructor injection
//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }


//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build() {


        comp.compile();
//        debug();
        System.out.println("working on awesome Project!!!");


    }


}
