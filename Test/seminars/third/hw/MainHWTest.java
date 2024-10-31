package seminars.third.hw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MainHWTest {
    @Test
    void evenOddNumberTest(){
    assertThat(MainHW.evenOddNumber(2)).isEqualTo(true);
    assertThat(MainHW.evenOddNumber(3)).isEqualTo(false);

    }

    @Test
    void numberInIntervalTest(){
        assertThat(MainHW.numberInInterval(25)).isEqualTo(true);
        assertThat(MainHW.numberInInterval(101)).isEqualTo(false);
        assertThat(MainHW.numberInInterval(100)).isEqualTo(true);
        assertThat(MainHW.numberInInterval(23)).isEqualTo(false);

    }
}
