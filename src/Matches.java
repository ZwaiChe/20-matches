/**
 * Created by annailinyh on 12/01/2020.
 */
public class Matches {
    private  int amountMatches;

    public  Matches() {
        this.amountMatches = 20;
    }

    public  int getAmountMatches() {
        return amountMatches;
    }

    public  void minusMaches(int matchesForMinus){
        amountMatches = amountMatches - matchesForMinus;

    }

}
