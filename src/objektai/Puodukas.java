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
    
    public boolean getTuscias() {
        return kiekis == 0;
    }
    
    public boolean getPilnas() {
        if (kiekis == turis) { // ARBA return kiekis == turis;
            return true;
        }
        return false;
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
    
    public void setSpalva(char naujaSpalva) {
        spalva = naujaSpalva;
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
