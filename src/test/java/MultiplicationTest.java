import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    @Test
    void multiplier() {
        assertEquals(110, Multiplication.multiplier(2));
        System.out.println("Test passed");
    }
}