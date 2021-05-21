package objektai;


public class Puodukas {
    
    private int turis;
    private char spalva;
    private int kiekis;
    
    public Puodukas(int t, char sp) {
        turis = t;
        spalva = sp;
        kiekis = 0;
    }
    
    public int getTuris() {
        return turis;
    }
    
    public int getKiekis() {
        return kiekis;
    }
    
    public char getSpalva() {
        return spalva;
    }
    
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
