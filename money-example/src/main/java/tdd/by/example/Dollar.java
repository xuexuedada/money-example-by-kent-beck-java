package tdd.by.example;

public class Dollar extends Money{


    public Dollar(int amount) {
        super(amount);
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Dollar dollar = (Dollar)obj;
        return amount == dollar.amount;
    }

}
