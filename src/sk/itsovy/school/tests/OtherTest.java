package sk.itsovy.school.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sk.itsovy.school.subjects.Other;

import static org.junit.jupiter.api.Assertions.*;

class OtherTest {
    Other o;
    @BeforeEach
    void setUp() {
        o = new Other();
    }

    @Test
    void isEur() {
        assertTrue(o.isEur("6"));
        assertTrue(o.isEur("6 Eur"));
        assertTrue(o.isEur("6.32"));
        assertTrue(o.isEur("6.32 eur"));
        assertTrue(o.isEur("6.32 Eur"));
        assertTrue(o.isEur("6.32Eur"));
        assertTrue(o.isEur("0"));
        assertTrue(o.isEur("6,32 Eur"));
        assertTrue(o.isEur("3€"));
        assertTrue(o.isEur("3 €"));
        assertFalse(o.isEur("5.2"));
        assertFalse(o.isEur("Eur"));
        assertFalse(o.isEur(".12Eur"));
        assertFalse(o.isEur(","));
    }
}