package tdd.by.example;

public class Dollar extends Money{


    private String currency;

    public Dollar(int amount) {
        super(amount);
        this.currency = "USD";
    }

    @Override
    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    String currency() {
        return currency;
    }

}
