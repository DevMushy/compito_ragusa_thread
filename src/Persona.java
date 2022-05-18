public class Persona extends Thread implements Comparable<Persona>{

    String nome;
    Spogliatoio spogliatoio;
    Semaforo semaforo;
    Gara pista;
    public Persona(String nome, Spogliatoio spogliatoio,Gara pista){
        this.nome = nome;
        this.spogliatoio = spogliatoio;
        this.pista = pista;
    }

    public void run(){
        
        spogliatoio.usaspogliatoio(nome);
        pista.gareggia(nome);
        spogliatoio.usaspogliatoio(nome);
    }

    @Override
    public int compareTo(Persona o) {
        return this.pista.getTot() - o.pista.getTot(); 
    }


    




}
