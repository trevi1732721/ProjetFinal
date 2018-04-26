package Déchet;

/**
 * Created by trevi1732721 on 2018-04-26.
 */
public class Neptunium extends Déchets{
     private String nom = "Neptunium";
     private int masseVolumique =20;

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public int getMasseVolumique() {
        return masseVolumique;
    }

    public void setMasseVolumique(int masseVolumique) {
        this.masseVolumique = masseVolumique;
    }
}
