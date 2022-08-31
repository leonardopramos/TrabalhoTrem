public class Locomotiva{
    private int id;
    private double pesoMax;
    private int nroMaxVagoes;
    private Trem trem;
    
    public Locomotiva(int id, double pesoMax, int nroMaxVagoes) {
        this.id = id;
        this.pesoMax = pesoMax;
        this.nroMaxVagoes = nroMaxVagoes;
        this.trem = null;
    }

    public int getId() {
        return id;
    }

    public double getPesoMax() {
        return pesoMax;
    }

    public int getNroMaxVagoes() {
        return nroMaxVagoes;
    }

    public Trem getTrem() {
        return trem;
    }

    public void setTrem(Trem trem){
        this.trem = trem;
    }

    @Override
    public String toString() {
        return "Locomotiva [id=" + id + ", nroMaxVagoes=" + nroMaxVagoes + ", pesoMax=" + pesoMax + ", trem=" + trem
                + "]";
    }
}
