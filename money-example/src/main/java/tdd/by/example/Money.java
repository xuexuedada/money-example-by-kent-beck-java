package tdd.by.example;

public abstract class Money {
    protected int amount;
    protected String currency;

    public Money(int amount) {
        this.amount = amount;
    }

    public Money() {
        this.currency = "CHF";
    }

    public static Money Franc(int i) {
        return new Franc(i, "CHF");
    }

    abstract Money times(int multiplier);


    public static Money Dollar(int amount) {
        return new Dollar(amount);
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    String currency() {
        return currency;
    }

}
