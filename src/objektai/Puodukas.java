package objektai;

public class Puodukas {
        
        private char spalva;
        private int turis;
        private int kiekis;
        
//konstruktorius
        public Puodukas(char spalva, int turis) { //spec tipas metodo, kuris neturi grazinamojo metodo. Pavadinimas turi buti identiskas klases pavadinimui
            this.spalva = spalva;
            this.turis = turis;
            this.kiekis = 0;
        }
        
        public int getTuris() {
            return this.turis;
        }
        public int getKiekis() {
            return this.kiekis;
        }
        
            //sintetinis geteris
        public boolean getPilnas() {
            return this.kiekis == this.turis;
        }
        
        public char getSpalva() {
            return this.spalva;
        }
        public void setSpalva(char spalva) { //nudaze, bet NEGRAZINO
            this.spalva = spalva;
        }
        
        
        public void ipilk(int kiekis) { //cia be static. Turi grazinti reiksme
            /*
            if (kiekis + kiek <= turis) { //patikrinam ar tilps
                kiekis += kiek; //jeigu telpa, pilu
            }
*/          if (kiekis <= 0) {
                return;
            }
            this.kiekis += kiekis; //this. kintamasis ,kad neieskotu scope, o objekte(klases kintamojo)
            if (this.kiekis > this.turis) {
                this.kiekis = this.turis;
            }
        }
        public void isgerk(int kiek) { //metodai
            if (kiek <= 0) {
                return;
            }
            kiekis -= kiek;
            if (kiekis < 0) {
                kiekis = 0;
            }
        }

}
