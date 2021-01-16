package objektai;

public class Termosas extends Puodukas {
        
    private int temp;
 
    public Termosas(char spalva, int turis) {
        super(spalva, turis);   //super konstruktorius
        this.temp = 20;
    }
 
    public int getTemp() {
        return this.temp;
    }
 
    public void pasildyk(int kiek) {
        if (kiek <= 0) {
            return;
        }
        this.temp += kiek;
    }
 
    public void atvesink(int kiek) {
        if (kiek <= 0) {
            return;
        }
        this.temp -= kiek;
    }
    
    public void ipilk(int kiek) {
        super.ipilk(kiek); //nurodymas, kad metodo 'ipilk' ieskoti auksciau stovincioje klaseje, tai yra Puodukas klasejes
        this.temp -= 5;
}
//    public String toString() {
//        return "Mano termosas";
//    }

    @Override
    public String toString() {
        return "Termosas{" + "temp=" + temp + '}';
    }
    
    
}