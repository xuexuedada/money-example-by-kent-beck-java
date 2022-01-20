package tdd.by.example;

public class Franc {

    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }


    public tdd.by.example.Dollar times(int multiplier) {
        return new tdd.by.example.Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Franc franc = (Franc) obj;
        return amount == franc.amount;
    }


}
