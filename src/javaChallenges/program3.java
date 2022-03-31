package javaChallenges;

public class program3 {
    public static void main(String[] args) {
        int cost=50;
        int disRate=12;
        int disAmount=cost*disRate/100;
        int sellPrice=cost-disAmount;
        System.out.println("The discount amount is: "+ disAmount);
        System.out.println("The selling price is: "+sellPrice);
    }
}
