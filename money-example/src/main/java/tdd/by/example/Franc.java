package tdd.by.example;

public class Franc extends Money{

    public Franc(int amount, String currency) {
        super(amount,currency);
    }


    @Override
    public Money times(int multiplier) {
        return new Franc(amount * multiplier,currency);
    }
}
