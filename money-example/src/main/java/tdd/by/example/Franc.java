package tdd.by.example;

public class Franc extends Money{


    public Franc(int amount) {
        this.amount = amount;
    }


    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Money franc = (Money) obj;
        return amount == franc.amount;
    }


}
