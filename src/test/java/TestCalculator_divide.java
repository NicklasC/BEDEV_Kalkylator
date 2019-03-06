import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class TestCalculator_divide {

    Calculator calculator = new Calculator();
    @Test
    public void divide_6_by_2_is_3(){
        assertEquals(3,calculator.divide(6,2),0);
    }

    @Test
    public void divide_6_by_1_is_6(){
        assertEquals(6,calculator.divide(6,1),0);
    }

    @Test
    public void divide_by_zero_gives_exception(){
        assertEquals(6,calculator.divide(6,0),0);
    }
}
