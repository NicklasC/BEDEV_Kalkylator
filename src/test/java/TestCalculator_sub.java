import org.junit.Test;

import static java.lang.Double.NEGATIVE_INFINITY;
import static java.lang.Double.POSITIVE_INFINITY;
import static org.junit.Assert.assertEquals;

public class TestCalculator_sub {

    Calculator calculator = new Calculator();

    @Test
    public void sub_5_minus_2_is_3(){
        assertEquals(3,calculator.sub(5,3),0);
    }

    @Test
    public void sub_0_minus_0_is_0(){
        assertEquals(0,calculator.sub(0,0),0);
    }

    @Test
    public void sub_5_minus_infinity_is_negative_infinity(){
        assertEquals(NEGATIVE_INFINITY,calculator.sub(5,NEGATIVE_INFINITY),0);
    }

    @Test
    public void positive_infinity_minus_negative_infinity_is_negative_infinity(){
        assertEquals(NEGATIVE_INFINITY,calculator.sub(POSITIVE_INFINITY,NEGATIVE_INFINITY),0);
    }
}

// TODO: Add testcases for non double input (Throw exception handling)