public class Villa extends ProprietePrivee{
    private boolean avecPiscine;

    public Villa(Personne p,int Id,String adr,double surface,int nbPiece,boolean avecPiscine){
        super(p, Id, adr, surface,nbPiece);
        this.avecPiscine= avecPiscine;
    }

    public String toString() {
        return (super.toString()+" ,La villa est avec piscine ou non: "+avecPiscine);
    }

    double calculImpot() {
        if(this.avecPiscine){
            return super.calculImpot()+200;
        }
        else {
            return super.calculImpot();
        }
    }
}
