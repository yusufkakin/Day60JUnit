import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class StopAtFiveTest {

    @Test
    void main() {
        String userInput = "5";
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        String expected = "Give a number:";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        StopAtFive.main(null);

        String[] lines = baos.toString().split(System.lineSeparator());
        String actual = lines[0];

        assertEquals(expected, actual);
    }
}