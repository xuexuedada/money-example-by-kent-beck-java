package tdd.by.example;

public class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.currency = currency;
        this.amount = amount;
    }

    public static Money Franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public static Money Dollar(int amount) {
        return new Dollar(amount,"USD");
    }


    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && currency().equals(money.currency);
    }

    String currency() {
        return currency;
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }
}
