/**
 * Created by JimmyRomero on 8/26/2016.
 */
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EANValidatorTest {
    private EANValidator number;

    @Before
    public void setUp(){
        number = new EANValidator();
    }

    @Test
    public void test_01() {
        assertTrue(number.validate("9783815820865"));
    }

    @Test
    public void test_02() {
        assertFalse(number.validate("9783815820864"));
    }

    @Test
    public void test_03() {
        assertTrue(number.validate("9783827317100"));
    }
}
