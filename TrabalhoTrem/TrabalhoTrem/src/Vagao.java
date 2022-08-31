public class Vagao {
    private int id;
    private double capacMax;
    private Trem trem;

    public Vagao(int id, int capacMax){
        this.id = id;
        this.capacMax = capacMax;
        this.trem = null;
    }

    public int getId(){
        return id;
    }

    public double getCapacMax(){
        return capacMax;
    }

    public Trem getTrem(){
        return trem;
    }

    public void setTrem(Trem trem){
        this.trem = trem;
    }

    @Override
    public String toString() {
        return "Vagao [capacMax=" + capacMax + ", id=" + id + ", trem=" + trem + "]";
    }
}
