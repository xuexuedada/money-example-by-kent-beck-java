package tdd.by.example;

public class Franc extends Money{

    private String curreny;

    public Franc(int amount) {
        this.amount = amount;
        this.curreny = "CHF";
    }


    @Override
    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    String currency() {
        return curreny;
    }


}
