import java.util.ArrayList;
public class Purse {
    private ArrayList coins;

    public Purse() {
        coins = new ArrayList();
    }

    public String toString(){
        String total = "";
        for(int i = 0; i < coins.size(); i++) {
            Coin c = (Coin) coins.get(i);
            total += "Coin " + (i+1) + ": " + c.getName() + ", " + c.getValue() +"\n";
        }
        return total;
    }

    // adds aCoin to the purse
    public void add(Coin aCoin) {
        coins.add(aCoin);
    }

    // returns total value of all coins in purse
    public double getTotal() {
        double total = 0;
        Coin coin = new Coin(0,"");
        for (int i = 0; i < coins.size(); i++) {
            coin = (Coin) coins.get(i);
            total += coin.getValue();
        }
        return total;
    }

    // returns the number of coins in the Purse that matches aCoin
// (both myName & myValue)
    public int count(Coin aCoin) {
        int total = 0;
        for (int i = 0; i < coins.size(); i++) {
            Coin c = (Coin) coins.get(i);
            if (c.getValue() == aCoin.getValue() && c.getName().equals(aCoin.getName())) {
                total++;
            }
        }
        return total;
    }

    public String findSmallest(){
        int min = 0;
        for(int i = 0; i < coins.size(); i++) {
            Coin c = (Coin) coins.get(i);
            Coin other = (Coin) coins.get(min);
            if (c.getValue() <  other.getValue())
                min = i;
        }
        Coin m = (Coin) coins.get(min);
        return m.getName();
    }
}
