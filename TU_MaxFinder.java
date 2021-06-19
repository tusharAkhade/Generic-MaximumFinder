import com.tushar.max.MaxFinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TU_MaxFinder {
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
