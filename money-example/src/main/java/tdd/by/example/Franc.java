package tdd.by.example;

public class Franc extends Money{

    public Franc(int amount, String currency) {
        super();
        this.amount = amount;
    }


    @Override
    public Money times(int multiplier) {
        return new Franc(amount * multiplier,null );
    }
}
