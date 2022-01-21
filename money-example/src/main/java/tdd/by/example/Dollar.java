package tdd.by.example;

public class Dollar extends Money{


    public Dollar(int amount) {
        super(amount);
    }

    @Override
    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    String currency() {
        return "USD";
    }

}
