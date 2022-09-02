import java.util.ArrayList;

public class GaragemLocomotivas {
    private ArrayList<Locomotiva> locomotivas;

    public GaragemLocomotivas(){
        locomotivas = new ArrayList<>(30);
    }

    public void locomotivaEntra(Locomotiva locomotiva){
        locomotivas.add(locomotiva);
    }

    public Locomotiva locomotivaSai(int id){
        for(int i=0;i<locomotivas.size();i++){
            if (locomotivas.get(i).getId() == id){
                Locomotiva removida = locomotivas.remove(i);
                return removida;
            }
        }
        return null;
    }
}
