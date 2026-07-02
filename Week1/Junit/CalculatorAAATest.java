package junit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CalculatorAAATest {
    Calculator calculator;
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup Completed");
    }
    @AfterEach
    public void tearDown() {
        System.out.println("Teardown Completed");
    }
    @Test
    public void testAddition() {
        int a = 10;
        int b = 20;
        int result = calculator.add(a, b);
        assertEquals(30, result);
    }
}