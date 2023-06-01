import static org.junit.jupiter.api.Assertions.*;
import org.example.Main;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testMult() {
        int expected = 25;
        int actual = Main.multiplier(5,5);
        assertEquals(expected, actual);
    }
}
