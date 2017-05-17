/**
 * Created by Biks on 5/17/2017.
 */
public class Passenger {
    private int checkedBags;
    private int freeBags;

    public int getCheckedBags() {return checkedBags;}
    public void setCheckedBags(int checkedBags) {this.checkedBags = checkedBags;}
    public int getFreeBags() {return freeBags;}
    public void setFreeBags(int freeBags) {this.freeBags = freeBags;}

    private double perBagFee;
    public double getPerBagFee() {return perBagFee;}

    public Passenger(int freeBags){
        this(freeBags > 1 ? 25.0d :50.0d);
        this.freeBags = freeBags;
    }

    public Passenger(int freeBags,int checkedBags){
        this(freeBags);
        this.checkedBags = checkedBags;
    }

    private Passenger(double perBagFee) {
        this.perBagFee = perBagFee;
    }
}
