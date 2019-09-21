package sk.itsovy.school.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {
    sk.itsovy.school.subjects.Math m;
    @BeforeEach
    void setUp() {
        m = new sk.itsovy.school.subjects.Math();
    }

    @Test
    void reverse() {
        assertEquals(123, m.reverse(321));
        assertEquals(-123, m.reverse(-321));
        assertEquals(0, m.reverse(3210));
        assertEquals(0, m.reverse(0));
    }

    @Test
    void isPrimeNumber() {
        assertTrue(m.isPrimeNumber(3));
        assertTrue(m.isPrimeNumber(5));
        assertTrue(m.isPrimeNumber(23));
        assertFalse(m.isPrimeNumber(34));
        assertFalse(m.isPrimeNumber(1));
        assertFalse(m.isPrimeNumber(-3));
    }
}