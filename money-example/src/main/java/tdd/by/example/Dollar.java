package tdd.by.example;

public class Dollar extends Money{


    public Dollar(int amount, String usd) {
        super(amount,usd);
    }

    @Override
    public Money times(int multiplier) {
        return new Dollar(amount * multiplier, "USD");
    }

}
