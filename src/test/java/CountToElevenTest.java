import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountToElevenTest {

    @BeforeEach
    void setUp() {
        System.out.println("Environment setup");
    }


    @Test
    void counter() {
        assertEquals(65, CountToEleven.counter(2));
        System.out.println("Test passed");
    }
}