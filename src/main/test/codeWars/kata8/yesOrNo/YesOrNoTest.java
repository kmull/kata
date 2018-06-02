package codeWars.kata8.yesOrNo;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class YesOrNoTest {

    YesOrNo yesOrNo;

    public void setup() {
        yesOrNo = new YesOrNo();
    }

    @Test
    public void checkIfYesOrNo(){
        setup();
        assertThat(yesOrNo.boolToWord(true), comparesEqualTo("Yes"));
        assertThat(yesOrNo.boolToWord(false), comparesEqualTo("No"));
    }
}
