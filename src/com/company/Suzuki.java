package com.company;

public class Suzuki extends Moto {


    @Override
    public void move() {
        System.out.println("Je roule comme une b...");
    }

    public Suzuki(String color) {
        super(color);
        //this.setColor("green");//color = "green";
    }
}
