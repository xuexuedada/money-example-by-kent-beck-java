package tdd.by.example;

public class Money {
    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public Money() {
    }

    public static Dollar Dollar(int i) {
        return new Dollar(5);
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && getClass().equals(money.getClass());
    }

}
