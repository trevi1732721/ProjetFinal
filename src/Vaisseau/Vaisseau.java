package Vaisseau;

import Déchet.Déchets;

import java.util.ArrayList;

/**
 * Created by trevi1732721 on 2018-04-26.
 */
public class Vaisseau {
    private Déchets[] liste = new Déchets [10];

    public Déchets[] getListe() {
        return liste;
    }

    public void setListe(Déchets[] liste) {
        this.liste = liste;
    }
}
