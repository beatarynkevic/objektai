package objektai;

public class Puodukas {
        
        public char spalva;
        public int turis;
        public int kiekis;

        public void ipilk(int kiek) { //cia be static
            /*
            if (kiekis + kiek <= turis) { //patikrinam ar tilps
                kiekis += kiek; //jeigu telpa, pilu
            }
*/
            kiekis += kiek;
            if (kiekis > turis) {
                kiekis = turis;
            }
        }
        public void isgerk(int kiek) { //metodai
            kiekis -= kiek;
            if (kiekis < 0) {
                kiekis = 0;
            }
        }

}
