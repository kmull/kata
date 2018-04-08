package pl.rekrutacja.palindrom;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PalindromTest {

    Palindrom palindrom;

    private void setUp(){
        palindrom = new Palindrom();
    }

    @Test
    public void shortPalindrom_test(){
        setUp();

        assertThat(palindrom.isPalindrom("abcd"), comparesEqualTo(false));
        assertThat(palindrom.isPalindrom("abba"), comparesEqualTo(true));
    }

    @Test
    public void shortPalindrom_test2(){
        setUp();

        assertThat(palindrom.isPalindrom(""), comparesEqualTo(false));
        assertThat(palindrom.isPalindrom("a"), comparesEqualTo(true));
    }

    @Test
    public void shortPalindrom_test3(){
        setUp();

        assertThat(palindrom.isPalindrom("andrzej"), comparesEqualTo(false));
        assertThat(palindrom.isPalindrom("kajak"), comparesEqualTo(true));
    }

}
