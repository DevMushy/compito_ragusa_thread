public class Semaforo {
    int valore;
    public Semaforo(int valore){
        this.valore = valore;
    }
    synchronized public void p(){
        while(valore==0){
            try {
                wait();
            } catch (Exception e) {
                
            }
        }
        valore--;
    }

    synchronized public void v(){
        valore++;
        notify();
    }
}
