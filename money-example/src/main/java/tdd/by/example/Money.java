package tdd.by.example;

public class Money {
    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        Dollar dollar = (Dollar)obj;
        return amount == dollar.amount;
    }
}
