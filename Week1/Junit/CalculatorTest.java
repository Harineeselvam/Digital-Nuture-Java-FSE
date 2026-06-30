package junit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {

        Calculator obj = new Calculator();

        assertEquals(10, obj.add(5, 5));
    }
}