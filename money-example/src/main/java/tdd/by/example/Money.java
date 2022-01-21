package tdd.by.example;

public abstract class Money {
    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public Money() {
    }

    abstract Money times(int multiplier);


    public static Dollar Dollar(int i) {
        return new Dollar(i);
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && getClass().equals(money.getClass());
    }

}
