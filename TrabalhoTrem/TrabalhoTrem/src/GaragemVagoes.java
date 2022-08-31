import java.util.ArrayList;

public class GaragemVagoes {
    private ArrayList<Vagao> vagoes;

    public GaragemVagoes(){
        vagoes = new ArrayList<>(2000);
    }

    public void vagaoEntra(Vagao vagao){
        vagoes.add(vagao);
    }

    public Vagao vagaoSai(int id){
        for(int i = 0;i < vagoes.size(); i ++ ){
            if (vagoes.get(i).getId() == id){
                Vagao removido = vagoes.remove(i);
                return removido;
            }
        }
        return null;
    }
}
