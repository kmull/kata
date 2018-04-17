package pl.myMatcher.regex;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GlownaTest {

    Glowna glowna;

    private void setUp() {
        glowna = new Glowna();
    }

    @Test
    public void checkMatch_1() {
//        setUp();
        String checkText = "--- - - Aaa -- adada ---";
        String myPattern = "(\\w+)(\\W+)(\\w+)";
        String expected = "Aaa -- adada";
        assertEquals(expected, Glowna.match(checkText, myPattern));

        checkText = "--- - - Aaa -6- adada ---";
        myPattern = "(\\w+)(\\W+)(\\d+)(\\W+)(\\w+)";
        expected = "Aaa -6- adada";
        assertEquals(expected, Glowna.match(checkText, myPattern));

        checkText = "--- - - Aaa -55- adada ---";
        expected = "Aaa -55- adada";
        assertEquals(expected, Glowna.match(checkText, myPattern));

        checkText = "AAA aaa03030aaa AAA";
        myPattern = "([a-z]+[0-9]+[a-z]+)";
        expected = "aaa03030aaa";
        assertEquals(expected, Glowna.match(checkText, myPattern));

        checkText = "AAA aaa 03030 aaa AAA";
        myPattern = "([a-z]+(\\s+)[0-9]+(\\s+)[a-z]+)";
        expected = "aaa 03030 aaa";
        assertEquals(expected, Glowna.match(checkText, myPattern));
    }
}

