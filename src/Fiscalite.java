public class Fiscalite {
    public static void main(String[] args) {
        Personne p1 = new Personne(0000, "Merzoug", "Salma");
        Personne p2 = new Personne(1111, "Garali", "Yosr");
        Personne p3 = new Personne(2222, "Labessi", "Zeineb");

        Lotissement lotissement = new Lotissement(10);

        Propriete propriete1 = new ProprietePrivee(p1, 1, "Corniche", 350, 4);
        Propriete propriete2 = new Villa(p2, 2, "Dar Chaabane", 400, 6, true);
        Propriete propriete3 = new Appartement(p2, 3, "Hammamet", 1200, 8, 3);
        Propriete propriete4 = new ProprieteProfessionnelle(p3, 4, "Korba", 1000, 50, true);
        Propriete propriete5 = new ProprieteProfessionnelle(p1, 5, "Bir Bouragba", 2500, 400, false);

        lotissement.ajouter(propriete1);
        lotissement.ajouter(propriete2);
        lotissement.ajouter(propriete3);
        lotissement.ajouter(propriete4);
        lotissement.ajouter(propriete5);

        System.out.println("Liste des propriétés :");
        lotissement.afficherProprietes();

        System.out.println("Nombre total de pièces : " + lotissement.getNbPieces());
    }
}
