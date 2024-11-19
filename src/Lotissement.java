public class Lotissement {
    protected Propriete[] tab;
    protected int nombre;

    // Constructeur avec initialisation du tableau
    public Lotissement(int capacite) {
        this.tab = new Propriete[capacite];
        this.nombre = 0;
    }

    public Propriete getProprieteByIndex(int i) {
        if (i >= 0 && i < nombre) {
            return tab[i];
        }
        return null;
    }

    public int getNbPieces() {
        int nbPieces = 0;
        for (int i = 0; i < nombre; i++) {
            if (tab[i] instanceof ProprietePrivee) {
                nbPieces += ((ProprietePrivee) tab[i]).nbPiece;
            }
        }
        return nbPieces;
    }

    public void afficherProprietes() {
        for (int i = 0; i < nombre; i++) {
            System.out.println(tab[i].toString());
        }
    }

    public boolean ajouter(Propriete p) {
        if (nombre < tab.length) {
            tab[nombre++] = p;
            return true;
        }
        return false;
    }

    public boolean supprimer(Propriete p) {
        for (int i = 0; i < nombre; i++) {
            if (tab[i].equals(p)) {

                for (int j = i; j < nombre - 1; j++) {
                    tab[j] = tab[j + 1];
                }
                tab[--nombre] = null;
                return true;
            }
        }
        return false;
    }
}
