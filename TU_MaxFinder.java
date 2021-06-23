import com.tushar.max.MaxFinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
* It is Test Cases for MaxFinder which find maximum of 3 float numbers
* In Test 1, maximum number is at first position
* In Test 2, maximum number is at second position
* In Test 3, maximum number is at third position
*/
public class TU_MaxFinder {
    @Test
    void whenFloatShouldReturnMax1() {
        Float num1 = 11.2f, num2 = 6.2f, num3 = 4.3f;
        Float max = MaxFinder.findMax(num1, num2, num3);
        Assertions.assertEquals(11.2f, max, "Validating max method");
    }

    @Test
    void whenFloatShouldReturnMax2() {
        Float num1 = 1.2f, num2 = 16.2f, num3 = 4.3f;
        Float max = MaxFinder.findMax(num1, num2, num3);
        Assertions.assertEquals(16.2f, max, "Validating max method");
    }

    @Test
    void whenFloatShouldReturnMax3() {
        Float num1 = 1.2f, num2 = 6.2f, num3 = 24.3f;
        Float max = MaxFinder.findMax(num1, num2, num3);
        Assertions.assertEquals(24.3f, max, "Validating max method");
    }
}
