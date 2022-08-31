import java.util.ArrayList;

public class Trem {
    private int id;
    // private 
    private ArrayList<Locomotiva> locomotivas;
    private ArrayList<Vagao> vagoes;

    public Trem (int id){
        this.id = id;
        locomotivas = new ArrayList<>();
        vagoes = new ArrayList<>();
    }

    public int getId(){
        return id;
    }

    public int getQntLocomotivas(){
        return locomotivas.size();
    }

    public Locomotiva getLocomotiva(int id){
        for(int i = 0; i < locomotivas.size(); i ++){
            if(locomotivas.get(i).getId() == id){
                return locomotivas.get(i);
            }
        }
        return null;
    }

    public int getQntVagoes(){
        return vagoes.size();
    }

    public Vagao getVagao(int id){
        for(int i = 0; i < locomotivas.size(); i ++){
            if(vagoes.get(i).getId() == id){
                return vagoes.get(i);
            }
        }
        return null;
    }

    public boolean engataLocomotiva(Locomotiva locomotiva){
        if(vagoes.size() >= 1){
            return false;
        }
        locomotivas.add(locomotiva);
        return true;
    }

    public boolean engataVagao(Vagao vagao){
        if(locomotivas.size() == 0){
            return false;
        }
        vagoes.add(vagao);
        return true;
    }

    public boolean desengataLocomotiva(){
        if(locomotivas.size() >= 1 && vagoes.size() == 0){
            int index = locomotivas.size()-1;
            locomotivas.remove(index);
            return true;
        }
        return false;
    }

    public boolean desengataVagao(){
        if(locomotivas.size() >= 1 && vagoes.size() >= 1){
            int index = vagoes.size()-1;
            vagoes.remove(index);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Trem [id=" + id + ", locomotivas=" + locomotivas + ", vagoes=" + vagoes + "]";
    }
    
}
