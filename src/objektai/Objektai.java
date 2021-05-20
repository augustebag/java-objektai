
package objektai;

public class Objektai {

    public static void main(String[] args) {
        
        Puodukas puodukas = new Puodukas();
        
        puodukas.turis = 300;
        puodukas.spalva = 'r';
        puodukas.kiekis = 0;

        puodukas.ipilk(100);

        System.out.println(puodukas.kiekis);

        puodukas.ipilk(100);
 
        System.out.println(puodukas.kiekis);
        
        puodukas.ipilk(500);
 
        System.out.println(puodukas.kiekis);
        System.out.println("geriam");        
        puodukas.isgerk(150);     
        System.out.println(puodukas.kiekis);
        
        puodukas.isgerk(250);
        System.out.println(puodukas.kiekis);
        
        puodukas.isgerk(-500);
        System.out.println(puodukas.kiekis);
        
        puodukas.ipilk(-500);
        System.out.println(puodukas.kiekis);
        
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
//        Puodukas kp = new Puodukas();  // kp - kitas puodukas
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
