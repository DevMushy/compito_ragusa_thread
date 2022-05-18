public class Spogliatoio {
    Semaforo semaforo;
    public Spogliatoio(Semaforo semaforo){
        this.semaforo = semaforo;
    }

    public void usaspogliatoio(String nome){
        

            semaforo.p();
            System.out.println(nome + " entra nello spogliatoio");
            System.out.println("");
        try {    
            Thread.sleep((long) Math.random()*1000);

        } catch (Exception e) {}

        semaforo.v();
        System.out.println(nome + " esce dallo spogliatoio");
        System.out.println("");

    }
}