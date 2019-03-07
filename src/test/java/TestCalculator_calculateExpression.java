import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator_calculateExpression {

    Calculator calculator = new Calculator();
    @Test
    public void calculateExpression_should_return_error_when_input_is_empty_string(){
        assertEquals("error",calculator.calculateExpression(""));

    }
    @Test
    public void calculateExpression_should_return_error_if_there_are_more_then_100_string_length(){
        assertEquals("error",calculator.calculateExpression("12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901"));
    }

    @Test
    public void calculateExpression_should_return_error_if_there_are_no_operation_characters_in_input_string(){
        assertEquals("error",calculator.calculateExpression("2345"));
    }


    @Test
    public void calculateExpression_should_return_error_when_input_contains_non_digits(){
        assertEquals("error",calculator.calculateExpression("abc"));
    }

    @Test
    public void calculateExpression_add_5_plus_2_is_7(){
        assertEquals("7",calculator.calculateExpression("5+2"));
    }

    @Test
    public void calculateExpression_sub_5_minus_3_is_2(){
        assertEquals("2",calculator.calculateExpression("5+3"));
    }

    @Test
    public void calculateExpression_divide_12_divided_by_4_is_3(){
        assertEquals("3",calculator.calculateExpression("12/4"));
    }

    @Test
    public void calculateExpression_mult_5_times_3_is_15(){
        assertEquals("15",calculator.calculateExpression("5*3"));
    }

    @Test
    public void calculateExpression_complex_calc_1(){
        assertEquals("8",calculator.calculateExpression("2+3*2"));
    }

    @Test
    public void calculateExpression_complex_calc_2(){
        assertEquals("14",calculator.calculateExpression("1+2+3*2-4/2*2"));
    }
}
