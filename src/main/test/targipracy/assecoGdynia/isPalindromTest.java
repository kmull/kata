package targipracy.assecoGdynia;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

    public class isPalindromTest {
    palindromString isPalindrom;

    private void setup(){
        isPalindrom = new palindromString();
    }

    @Test
    public void setIsPalindronTest_1(){
        setup();
        assertEquals(true, isPalindrom.isPalindrom("ala"));
    }

}
