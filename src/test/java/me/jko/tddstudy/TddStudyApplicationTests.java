package me.jko.tddstudy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// TODO 1. multiplication : DONE
// TODO 2. equality : DONE

class TddStudyApplicationTests {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
    }
}
