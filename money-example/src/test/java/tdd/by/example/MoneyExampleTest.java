package tdd.by.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyExampleTest {


    @Test
    void testMultiplication() {
        Money five = Money.Dollar(5);
        assertEquals(Money.Dollar(10), five.times(2));
        assertEquals(Money.Dollar(15), five.times(3));
    }

    @Test
    void testEquality() {
        assertEquals(Money.Dollar(5), Money.Dollar(5));
        assertNotEquals(Money.Dollar(5), Money.Dollar(6));
        assertEquals(Money.Franc(5), Money.Franc((5)));
        assertNotEquals(Money.Franc(5), Money.Franc((6)));
    }

    @Test
    void testCompareFrancsWithDollars() {
        assertNotEquals(Money.Dollar(5), Money.Franc(5));
    }

    @Test
    void testFrancMultiplication() {
        Money five = Money.Franc(5);
        assertEquals(Money.Franc(10), five.times(2));
        assertEquals(Money.Franc(15), five.times(3));
    }

    @Test
    void testCurrency() {
        assertEquals("USD",Money.Dollar(1).currency());
        assertEquals("CHF",Money.Franc(1).currency());
    }

    @Test
    void testDifferentClassEquality() {
        assertEquals(new Money(10, "CHF"), new Franc(10, "CHF"));
    }
}

