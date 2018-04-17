package pl.myMatcher.palindrom;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class StringPalindromTest {

    StringPalindrom stringPalindrom;

    private void setUp(){
        stringPalindrom = new StringPalindrom();
    }

    @Test
    public void shortPalindrom_test(){
        setUp();

        assertThat(stringPalindrom.isPalindrom("abcd"), comparesEqualTo(false));
        assertThat(stringPalindrom.isPalindrom("abba"), comparesEqualTo(true));
    }

    @Test
    public void shortPalindrom_test2(){
        setUp();

        assertThat(stringPalindrom.isPalindrom(""), comparesEqualTo(false));
        assertThat(stringPalindrom.isPalindrom("a"), comparesEqualTo(true));
    }

    @Test
    public void shortPalindrom_test3(){
        setUp();

        assertThat(stringPalindrom.isPalindrom("andrzej"), comparesEqualTo(false));
        assertThat(stringPalindrom.isPalindrom("kajak"), comparesEqualTo(true));
    }

}
