package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Moto m = new Moto("red");
        Voiture v = new Voiture();
        Moto m2 = new Moto("green");
        Suzuki s = new Suzuki("SUzuki");

        List<Vehicule> vehicules = new ArrayList<>();
        vehicules.add(s);
        vehicules.add(m);
        vehicules.add(v);
        vehicules.add(m2);

        Collections.sort(vehicules, new ComparaisonVehicule());


        for (Vehicule vh : vehicules){
            vh.describe();
        }
        System.out.println();

        /*
        faireRouler(m);
        faireRouler(new Voiture());
        faireRouler(new Suzuki("blue"));
        faireRouler((new Suzuki("yellow")));

*/
    }

    public static void faireRouler(Vehicule vehicule) {
        vehicule.move();
        vehicule.describe();
    }

}
