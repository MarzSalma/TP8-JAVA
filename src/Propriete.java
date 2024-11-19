abstract public class Propriete {
    protected int Id;
    protected Personne resp;
    protected String adr;
    protected double surface;

    public Propriete(Personne p,int Id,String adr, double surface){
        resp=p;
        this.Id=Id;
        this.adr=adr;
        this.surface=surface;
    }

    public String toString() {
        return ("L'id est : " +Id+ ", le nom est: " +resp+ ", l'adresse est: " +adr+ " ,la surface est : " + surface);
    }
    abstract double calculImpot();
}
