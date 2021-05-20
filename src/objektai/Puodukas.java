package objektai;


public class Puodukas {
    
    public int turis;
    public char spalva;
    public int kiekis;
    
    public void ipilk(int kiek) {
        if (kiek <= 0) {
            return;
        }
        
        kiekis += kiek;
        if (kiekis > turis) {
            kiekis = turis;
        }
    }
    
    public void isgerk(int kiek) {
        if (kiek > 0) {
            kiekis -= kiek;
            if (kiekis < 0) {
                kiekis = 0;
            }
        }
    }
}
