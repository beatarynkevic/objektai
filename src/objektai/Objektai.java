package objektai;
                                //2021-01-13

public class Objektai {

    public static void main(String[] args) {
        /*
        1. !!!m2 rodo i tapati objekta, kaip m1
        int[] m1 = {1, 2, 3};
        int[] m2 = m1;

        m2[1] = 15;
        
        System.out.println(m1[1]);
        System.out.println(m2[1]);
*/      
        /*
        2. !!!m2 turi nuoroda i nauja objekta 
        int[] m1 = {1, 2, 3};
        int[] m2 = new int[m1.length]; //priskirta tiek pat poziciju kiek m1
        for (int i = 0; i < m1.length; i++) {
            m2[i] = m1[i];    //priskirti tas pacias reiksmes pozicijom, kaip ir m1
        }

        System.out.println(m1[1]);
        System.out.println(m2[1]);

*/
        
        Puodukas p1 = new Puodukas();
        p1.spalva = 'r';
        p1.turis = 300;
        p1.kiekis = 0;
        
        Puodukas p2 = new Puodukas();
        p2.spalva = 'b';
        p2.turis = 150;
        p2.kiekis = 0;
        
        p1.ipilk(120); //puoduko klaseje ieskos metodu
        p1.isgerk(30);
        p1.ipilk(500);
        
        Puodukas p3 = p1; //nuoroda i puoduka
        
        p3.kiekis = 120;
        
        System.out.println(p1.turis + " turis 1 puoduko");
        System.out.println(p2.turis + " turis 2 puoduko");
        
        System.out.println(p1.kiekis + " kiekis 1 puoduko");
        System.out.println(p2.kiekis + " kiekis 2 puoduko");
        
    }
    
}