package com.company;

import com.company.Vehicule;

public abstract class MoyenDeTransport implements Vehicule {

    @Override
    public void move() {
        System.out.println("Je roule comme une voiture parce que je suis une voiture");
    }

    public abstract void toto();

}
