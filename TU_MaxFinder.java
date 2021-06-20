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
}
