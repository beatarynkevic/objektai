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
        
        Puodukas p1 = new Puodukas('Z', 300);
//        p1.spalva = 'r';
//        p1.turis = 300;
//        p1.kiekis = 0;
            p1.isgerk(-1000);
//            System.out.println(p1.getKiekis());
        
        Puodukas p2 = new Puodukas('B', 150);
//        p2.spalva = 'b';
//        p2.turis = 150;
//        p2.kiekis = 0;
        
        p1.ipilk(120); //puoduko klaseje ieskos metodu
        p1.isgerk(30);
        p2.ipilk(150);
        
        Puodukas p3 = p1; //nuoroda i puoduka
        
        /*is isores nebegalima pakeisti kiekio arba turio reiksmiu,
        nebent!!! per ipilk/isgerk metodus*/
        
        System.out.println(p1.getTuris() + " turis 1 puoduko");
        System.out.println(p2.getTuris() + " turis 2 puoduko");
        
        System.out.println(p1.getKiekis() + " kiekis 1 puoduko");
        System.out.println(p2.getKiekis() + " kiekis 2 puoduko");
        System.out.println(p2.getPilnas());
        
        //Termosas  2021-01-14
//        Termosas t1 = new Termosas('b', 1000);
// 
//        System.out.println(t1.getTemp());
//        System.out.println(t1.getTuris());
        Termosas t1 = new Termosas('b', 1000); //kintamasis i sio tipo
        t1.pasildyk(50);
        System.out.println(t1.getKiekis() + "kiekis");
        System.out.println(t1.getTemp() + "temp");
        t1.ipilk(50);
        System.out.println(t1.getKiekis() + "kiekis");
        System.out.println(t1.getTemp() + "temp");
        
        Puodukas p4 = new Termosas('R', 1500); //paveldetas. Polimofirzmas
//        p4.pasildyk(50); neveiks, nes

        //p4 = p1; 
        
        Termosas t2 = (Termosas) p4; //class kasting. Nurodoma, kad i sita objekta ziureti kaip i termosa
        t2.pasildyk(50);
        System.out.println(t2.getTemp());
        
        System.out.println(t1.getTemp());
        System.out.println(t1.getTuris());
        
        Termosas t3 = new Termosas('g', 500);
        
        System.out.println(t3);
        
//        Puodukas p5 = t3;
//        Object o  = t3; //kintamasis o rodo i objekta
        
//        if (o instanceof Puodukas) { //operatoriu 'instanceof' sako i ka rodo kintamasis o
//            System.out.println("Puodukas");
//        }
//        
//        Object ob = null; //default reiksme. Kintamasis ob nerodo i joki objekta
//        
//        String a = "Labas pasauli";
//        a = a + " ar tikrai?";      //kintamasis a rodo i nauja objekta
//        
//        //Immutable
//        if (a == "Labas pasauli ar tikrai?") { //ar rodo i ta pati objekta ==. Grazintu true jeigu fiziskai i ta pati objekta rodytu
//            System.out.println("lygu");
//        } else {
//            System.out.println("nelygu");
//        }
//        System.out.println(a);
//        
//        //Cashable
//        String ks = "lygu1";
//        
//        if (ks == "lygu1") {
//            System.out.println("lygu");
//        } else {
//            System.out.println("nelygu");
//        }
//        
    }
    
          
    
}
