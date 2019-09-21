package sk.itsovy.school.tests;

import sk.itsovy.school.subjects.English;

import static org.junit.jupiter.api.Assertions.*;

class EnglishTest {
    English en;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        en = new English();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void translate() {
        assertEquals("dog", en.translate("pes"));
        assertEquals("dog", en.translate("Pes"));
        assertEquals("dog", en.translate("pES"));
        assertEquals("dog", en.translate("PES"));
        assertEquals("dog", en.translate("pEs"));
        assertEquals(null, en.translate("fdsfds"));
        assertEquals(null, en.translate(null));
    }
}