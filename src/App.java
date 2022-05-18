public class App {
    public static void main(String[] args) throws Exception {
        Semaforo spogliatoio = new Semaforo(2);
        Semaforo pista = new Semaforo(4);
        Classifica c = new Classifica();
        Spogliatoio f = new Spogliatoio(spogliatoio);
        Gara gara = new Gara(pista);
        Persona p1 = new Persona("giovanni",f,gara);
        Persona p2 = new Persona("marco", f,gara);
        Persona p3 = new Persona("antonio", f,gara);
        Persona p4 = new Persona("gigi", f,gara);
        Persona p5 = new Persona("salvio",f,gara);
        Persona p6 = new Persona("ginevra", f,gara);
        Persona p7 = new Persona("marco", f,gara);
        Persona p8 = new Persona("fuffy", f,gara);
        //!!!!! nel mio computer è come se non funzionasse lo sleep l'ha controllato anche lei 
        p1.run();
        p2.run();
        p3.run();
        p4.run();
        p5.run();
        p6.run();
        p7.run();
        p8.run();

        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        p7.join();
        p8.join();
        

        c.addTempo(p1);
        c.addTempo(p2);
        c.addTempo(p3);
        c.addTempo(p4);
        c.addTempo(p5);
        c.addTempo(p6);
        c.addTempo(p7);
        c.addTempo(p8);

        c.ordina();

        c.stampalista();

    }
}
