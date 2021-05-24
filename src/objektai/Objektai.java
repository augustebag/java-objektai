
package objektai;

public class Objektai {

    public static void main(String[] args) {
        
        Puodukas puodukas = new Puodukas(300, 'r');
        
        System.out.println("Puodukas1:" + puodukas.getTuris());
        System.out.println("Puodukas1:" + puodukas.getSpalva());
        puodukas.setSpalva('Z');
        System.out.println("Puodukas1:" + puodukas.getSpalva());

        puodukas.ipilk(250);
        System.out.println("Puodukas1:" + puodukas.getKiekis());
        System.out.println(puodukas.getPilnas());
        puodukas.ipilk(250);
        System.out.println("Puodukas1:" + puodukas.getKiekis());
        System.out.println(puodukas.getPilnas());
       
        Namas n = new Namas();
        n.aukstai = 5;
        n.butai = 90;
        System.out.println(n.aukstai);
        System.out.println(n.butai);
        
        
        String s = "Labas";
        
        String s1 = "Labas";
        
        String s2 = "La";
        s2 += "bas";
        
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        
        System.out.println(s == s1);
        System.out.println(s == s2);

//        Puodukas p = new Puodukas();
//        p.turis = 300;
//        p.spalva = 'r';
//        p.kiekis = 0;
//        
//        Puodukas kp = new Puodukas(150, 'b');  // kp - kitas puodukas
//        System.out.println("Puodukas2:" + kp.turis);
//        System.out.println("Puodukas2:" + kp.spalva);
//        kp.turis = 150;
//        kp.spalva = 'b';
//        kp.kiekis = 100;
//       
//        Puodukas dvp = p; // dvp - dar vienas puodukas
//        dvp.kiekis = 200;
        
//        System.out.println(p.turis);
//        System.out.println(kp.turis);
//        System.out.println("1----");
//        System.out.println(p.kiekis);
//        System.out.println(kp.kiekis);
//        System.out.println(dvp.kiekis);
//        
//        dvp = kp;
//        dvp.kiekis = 20;
//        System.out.println("2----");
//        System.out.println(p.kiekis);
//        System.out.println(kp.kiekis);
//        System.out.println(dvp.kiekis);

    }
    
}
