package pl.kata.alt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;

public class SolutionAlt {

    Alt alt;

    public void setUp() {
        alt = new Alt();
    }

    @Test
    public void testSomething() {
        setUp();
        // assertEquals("expected", "actual");
        assertEquals(true, Alt.isAlt("amazon"));
        assertEquals(true, Alt.isAlt("banana"));
    }

    @Test
    public void testSomething2() {
        setUp();
        assertEquals(false, Alt.isAlt("apple"));

    }
}
