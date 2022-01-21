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

     Money times(int multiplier){
         return null;
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
