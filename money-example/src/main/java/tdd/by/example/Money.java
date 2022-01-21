package tdd.by.example;

public class Money {
    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public Money() {
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && getClass().equals(money.getClass());
    }

}
