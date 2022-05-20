import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {

    @Test
    void sum() {
        assertEquals(4, Calculations.sum(4, 4));
    }

    @Test
    void extract() {
        assertEquals(0 , Calculations.extract(4, 4));
    }

    @Test
    void divide() {
        assertEquals(1 , Calculations.divide(4, 4));
    }

    @Test
    void multiply() {
        assertEquals(16 , Calculations.multiply(4, 4));
    }
}