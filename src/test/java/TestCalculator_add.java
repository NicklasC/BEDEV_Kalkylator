import org.junit.Test;

import static java.lang.Double.POSITIVE_INFINITY;
import static org.junit.Assert.assertEquals;

public class TestCalculator_add {


    Calculator calculator = new Calculator();

    @Test
    public void add_3_plus_6_is_9(){
        assertEquals(9,calculator.add(3,6),0);
    }

    @Test
    public void add_0_plus_0_is_0(){
        assertEquals(0,calculator.add(0,0),0);
    }

    @Test
    public void add_5_plus_minus_2_is_3(){
        assertEquals(3,calculator.add(5,-2),0);
    }

    @Test
    public void add_maxValue_plus_0_is_maxValue(){
        assertEquals(1.7E+308,calculator.add(1.7E+308,0),0);
    }

    @Test
    public void add_maxValue_plus_maxValue_is_Infinity(){
        assertEquals(POSITIVE_INFINITY,calculator.add(1.7976931348623157E308,1.7976931348623157E308),0);
    }

    @Test
    public void add_Infinity_plus_0_is_Infinity(){
        assertEquals(POSITIVE_INFINITY,calculator.add(POSITIVE_INFINITY,0),0);
    }


    // TODO: Add testcases for non double input (Throw exception handling)
}
