public class Appartement extends ProprietePrivee{
    public int numEtage;

    public Appartement(Personne p,int Id,String adr,double surface ,int nbPiece,int numEtage){
        super(p, Id, adr, surface,nbPiece);
        this.numEtage=numEtage;
    }

    public String toString() {
        return (super.toString()+" ,le numero d'etage est: " +numEtage);
    }
}
