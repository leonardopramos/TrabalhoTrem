import java.util.ArrayList;

public class PatioTrens {
    private ArrayList<Trem> trens;

    public PatioTrens(){
        trens = new ArrayList<>(20);
    }

    public void tremEntra(Trem trem){
        trens.add(trem);
    }

    public Trem tremSai(int id){
        for(int i = 0; i < trens.size(); i ++){
            if(trens.get(i).getId() == id){
                Trem removido = trens.remove(i);
                return removido;
            }
        }
        return null;
    }
}
