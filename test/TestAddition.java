import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestAddition {

    @Test
    @Category(FastTests.class)
    public void testSumPositiveNumbersOneAndOne() {
        Calculator adder = new Calculator();
        assert(adder.add(1, 1) == 2);
    }

    @Test
    @Category(FastTests.class)
    public void testSumPositiveNumbersOneAndTwo() {
        Calculator adder = new Calculator();
        assertTrue(adder.add(1, 2) == 3);
    }

    @Test
    public void testSumPositiveNumbersTwoAndTwo() {
        Calculator adder = new Calculator();
        assertFalse(adder.add(2, 2) == 5);
    }

    @Test
    public void testSumZeroNeutral() {
        Calculator adder = new Calculator();
        assert(adder.add(0, 0) == 0);
    }

    @Test
    public void testSumNegativeNumbers() {
        Calculator adder = new Calculator();
        assert(adder.add(-1, -2) == -3);
    }

    @Test
    public void testSumPositiveAndNegative() {
        Calculator adder = new Calculator();
        assert(adder.add(-1, 1) == 0);
    }

    @Category(SlowTests.class)
    @Test
    public void testSumLargeNumbers() {
        Calculator adder = new Calculator();
        assert(adder.add(1234, 988) == 2222);
    }

    @Category(SlowTests.class)
    @Test(timeout=10)
    public void testSumManyTimes() {
        Calculator adder = new Calculator();
        float sum = 0;
        for(int i = 0; i < 1000000; i++) {
            sum = adder.add(sum, 1);
        }
        assertEquals(sum, 1000000, 0.01);
    }
}