import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class PositiveNumbersTest {

    @Test
    @DisplayName("Tests if the output is correct with positive input")
    void main() {
        String userInput = "2";
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        String expected = "Number is 2";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        PositiveNumbers.main(null);

        String[] lines = baos.toString().split(System.lineSeparator());
        String actual = lines[lines.length-1];

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Tests if the output is correct with negative input")
    void main2() {
        String userInput = "-2";
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        String expected = "Number must be a positive number";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        PositiveNumbers.main(null);

        String[] lines = baos.toString().split(System.lineSeparator());
        String actual = lines[lines.length-1];

        assertEquals(expected, actual);
    }

}