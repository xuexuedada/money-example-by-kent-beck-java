package tdd.by.example;

/**
 * Created by benwu on 14-5-2.
 */
public class Dollar extends Money {

    // TODO-sin: Dollar/Franc duplication

    public Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    // TODO-sin: Common times
    public Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

}
