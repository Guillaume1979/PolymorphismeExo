package com.company;

public class Moto extends MoyenDeTransport {

    private String color;

    public Moto(String color) {
        this.setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == "yellow") {
            return;
        }
        this.color = color;
    }

    //constructeur par défaut
    public Moto() {


    }

    @Override
    public void move() {
        System.out.println("Je roule plus vite que les voitures");
    }

    @Override
    public void describe() {
        System.out.println("je suis une moto " + color);
    }

    @Override
    public void toto() {

    }
}
