import com.tushar.max.MaxFinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TU_MaxFinder {
    @Test
    void whenIntegerShouldReturnMax1() {
        Integer int1 = 6, int2 = 1, int3 = 4;
        Integer max = MaxFinder.findMax(int1, int2, int3);
        Assertions.assertEquals(6, max, "Validating max method");
    }

    @Test
    void whenIntegerShouldReturnMax2() {
        Integer int1 = 1, int2 = 6, int3 = 4;
        Integer max = MaxFinder.findMax(int1, int2, int3);
        Assertions.assertEquals(6, max, "Validating max method");
    }

    @Test
    void whenIntegerShouldReturnMax3() {
        Integer int1 = 1, int2 = 4, int3 = 6;
        Integer max = MaxFinder.findMax(int1, int2, int3);
        Assertions.assertEquals(6, max, "Validating max method");
    }

    @Test
    void whenFloatShouldReturnMax1() {
        Float num1 = 11.2f, num2 = 6.2f, num3 = 4.3f;
        Float max = MaxFinder.findMax(num1, num2, num3);
        Assertions.assertEquals(11.2f, max, "Validating max method");
    }

    @Test
    void whenFloatShouldReturnMax2() {
        Float num1 = 4.3f, num2 = 11.2f, num3 = 6.2f;
        Float max = MaxFinder.findMax(num1, num2, num3);
        Assertions.assertEquals(11.2f, max, "Validating max method");
    }

    @Test
    void whenFloatShouldReturnMax3() {
        Float num1 = 4.3f, num2 = 6.2f, num3 = 11.2f;
        Float max = MaxFinder.findMax(num1, num2, num3);
        Assertions.assertEquals(11.2f, max, "Validating max method");
    }

    @Test
    void whenStringShouldReturnMax1() {
        String str1="Peach", str2 = "Apple", str3 = "Banana";
        String maxString = MaxFinder.findMax(str1, str2, str3);
        Assertions.assertEquals("Peach", maxString, "Validating maxFinder function");
    }

    @Test
    void whenStringShouldReturnMax2() {
        String str1="Apple", str2 = "Peach", str3 = "Banana";
        String maxString = MaxFinder.findMax(str1, str2, str3);
        Assertions.assertEquals("Peach", maxString, "Validating maxFinder function");
    }

    @Test
    void whenStringShouldReturnMax3() {
        String str1="Banana", str2 = "Apple", str3 = "Peach";
        String maxString = MaxFinder.findMax(str1, str2, str3);
        Assertions.assertEquals("Peach", maxString, "Validating maxFinder function");
    }
}
