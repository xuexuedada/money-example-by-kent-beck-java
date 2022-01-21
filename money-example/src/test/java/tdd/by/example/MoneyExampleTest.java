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
        assertEquals(new Franc(5), new Franc((5)));
        assertNotEquals(new Franc(5), new Franc((6)));
    }

    @Test
    void testCompareFrancsWithDollars() {
        assertNotEquals(Money.Dollar(5), new Franc(5));
    }

    @Test
    void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

}

