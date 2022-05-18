public class Gara {

    Semaforo pista;
    long start;
    long fine;
    long tot;

    public Gara(Semaforo pista){
        
        this.pista = pista;
    }

    public void gareggia(String nome){
        try {

            pista.p();
            System.out.println(nome + " entra in pista");
            System.out.println("");
            start = System.nanoTime();
            for (int i = 0; i < 15; i++) {
                Thread.sleep((long) Math.random()*1000);  
            }
            fine = System.nanoTime();

            tot = (fine - start)/1000000;

            pista.v();

        } catch (Exception e) {}

        System.out.println(nome + " esce dalla pista");
        System.out.println("");

    }    

    public int getTot(){
        return (int)tot;
    }


    
}
