import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class TestParametrized {

    private int m1;
    private int m2;

    public TestParametrized(int p1, int p2) {
        m1 = p1;
        m2 = p2;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { 1 , 2 }, { 5, 3 }, { 121, 4 } };
        return Arrays.asList(data);
    }


    @Test
    public void testAddParametrized() {
        Calculator calc = new Calculator();
        assertEquals("Result", m1 + m2, calc.add(m1, m2), 0.01);
    }

    @Test
    public void testMultiplyParametrized() {
        Calculator calc = new Calculator();
        assertEquals("Result", m1 * m2, calc.multiply(m1, m2), 0.01);
    }

    @Test
    public void testDivideParametrized() {
        Calculator calc = new Calculator();
        assertEquals("Result", m1 / m2, calc.divide(m1, m2), 0.01);
    }


}
