import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class WeightTest {
    @Test
    public void echo() {
        double inputHeight = 170;
        int inputGender = 2;
        double expectMan = (inputHeight - 100) * 1.15;
        double expectWoman = (inputHeight - 110) * 1.15;
        Weight weight = new Weight();
        double resultWoman = weight.idealWoman(inputHeight);
        assertThat(resultWoman, is(expectWoman));

    }

}
