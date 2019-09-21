package sk.itsovy.school.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sk.itsovy.school.subjects.SlovakLanguage;

import static org.junit.jupiter.api.Assertions.*;

class SlovakLanguageTest {
    SlovakLanguage sl;
    @BeforeEach
    void setUp() {
        sl = new SlovakLanguage();
    }

    @Test
    void formatText() {
        assertEquals("S.", sl.formatText("s"));
        assertEquals(".", sl.formatText("."));
        assertEquals("Sa.", sl.formatText("sA"));
        assertEquals("Sa?", sl.formatText("Sa?"));
        assertEquals(null, sl.formatText(null));
    }
}