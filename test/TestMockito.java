import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class TestMockito  {

    float a,b,res;

    public TestMockito(float p1, float p2, float p3) {
        a = p1;
        b = p2;
        res = p3;
    }

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { 1 , 2 , -1}, { 1, 3, -2}, { 121, 4 , 117}, {-25, 5, -30} };
        return Arrays.asList(data);
    }

    @Test
    public void test1()  {
        Calculator test = Mockito.mock(Calculator.class);

        when(test.add(a, -b)).thenReturn(res);
        // doReturn(res).when(test).add(a, -b);

        assertEquals(test.subtract(a,b), test.add(a,-b), 0.1);
    }


}
