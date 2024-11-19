public class ProprietePrivee extends Propriete{
    protected int nbPiece;

    public ProprietePrivee(Personne p, int Id, String adr, double surface, int nbPiece){
       super(p, Id, adr, surface);
       this.nbPiece=nbPiece;
    }

    public String toString() {
        return (super.toString()+" ,Le nombre de piece est: "+nbPiece);
    }

    double calculImpot() {
        return ((this.surface/100)*50+(this.nbPiece*10));
    }
}
