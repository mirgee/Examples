import org.junit.*;
import org.junit.experimental.categories.Category;

import static junit.framework.TestCase.fail;

public class TestDivision {

    static int a;
    static int b;
    Calculator calc;

    @BeforeClass
    public static void initialize() {
        a = 6;
        b = 2;
    }

    @Before
    public void prepareClass() {
        calc = new Calculator();
    }

    @Category(FastTests.class)
    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        calc.divide(1,0);
    }

    @Test
    public void testDivisonInitialized() {
        calc.divide(a,b);
    }

    @Ignore("This test is stupid.")
    @Test
    public void thisWillFail(){
        fail();
    }

    @AfterClass
    public static void cleanUp() {
        a = 0;
        b = 0;
    }
}
