public class ProprieteProfessionnelle extends Propriete{
    private int nbEm;
    private boolean estEtatique;

    public ProprieteProfessionnelle(Personne p, int Id, String adr, double surface, int nbEm, boolean estEtatique){
        super(p, Id, adr, surface);
        this.nbEm=nbEm;
        this.estEtatique=estEtatique;
    }

    public String toString() {
        return (super.toString()+" ,le nombre des emplyees est: "+nbEm+" ,est ce que etatique ou non: "+estEtatique);
    }

    double calculImpot() {
        if(this.estEtatique){
        return (100*super.surface+30*this.nbEm);
    }
        else {
            return 0;
        }
    }
}
