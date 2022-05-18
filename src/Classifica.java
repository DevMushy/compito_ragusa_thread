import java.util.ArrayList;
import java.util.Collections;

public class Classifica {
    
    ArrayList<Persona> c;

    public Classifica() {
        c = new ArrayList<Persona>();
    }

    public void addTempo(Persona p){
        c.add(p);
    }

    public void ordina(){
        Collections.sort(c);
    }
    

    public void stampalista(){
        for (int i = 0; i < c.size(); i++) {
            System.out.println("nome: " + c.get(i).nome + " tempo (mls): " + c.get(i).pista.getTot());
        }
    }

}
