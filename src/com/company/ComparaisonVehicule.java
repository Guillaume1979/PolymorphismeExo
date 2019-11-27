package com.company;

import java.util.Comparator;

public class ComparaisonVehicule implements Comparator<Vehicule> {

    @Override
    public int compare(Vehicule o1, Vehicule o2) {
        if (o1.getClass() == o2.getClass()) {
            return 0;
        } else if (o1.getClass() == Moto.class) {
            return -1;
        } else if (o1.getClass() == Voiture.class) {
            return -1;
        } else {
            return 1;
        }
    }
}
