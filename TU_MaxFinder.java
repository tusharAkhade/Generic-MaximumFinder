import com.tushar.max.MaxFinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TU_MaxFinder {
    @Test
    void whenShouldReturnMax1() {
        Integer int1 = 6, int2 = 1, int3 = 4;
        Float float1 = 6.1f, float2 = 1.1f, float3 = 4.1f;
        String str1 = "Peach", str2 = "Banana", str3 = "Apple";
        Object integerMax = new MaxFinder(int1, int2, int3).findMax(int1, int2, int3);
        Object floatMax = new MaxFinder(float1, float2, float3).findMax(float1, float2, float3);
        Object stringMax = new MaxFinder(str1, str2, str3).findMax(str1, str2, str3);
        Assertions.assertEquals(6, integerMax, "Validating max method");
        Assertions.assertEquals(6.1f, floatMax, "Validating max method");
        Assertions.assertEquals("Peach", stringMax, "Validating max method");
    }

    @Test
    void whenShouldReturnMax2() {
        Integer int1 = 1, int2 = 6, int3 = 4;
        Float float1 = 1.1f, float2 = 6.1f, float3 = 4.1f;
        String str1 = "Banana", str2 = "Peach", str3 = "Apple";
        Object integerMax = new MaxFinder(int1, int2, int3).findMax(int1, int2, int3);
        Object floatMax = new MaxFinder(float1, float2, float3).findMax(float1, float2, float3);
        Object stringMax = new MaxFinder(str1, str2, str3).findMax(str1, str2, str3);
        Assertions.assertEquals(6, integerMax, "Validating max method");
        Assertions.assertEquals(6.1f, floatMax, "Validating max method");
        Assertions.assertEquals("Peach", stringMax, "Validating max method");
    }

    @Test
    void whenShouldReturnMax3() {
        Integer int1 = 4, int2 = 1, int3 = 6;
        Float float1 = 4.1f, float2 = 1.1f, float3 = 6.1f;
        String str1 = "Apple", str2 = "Banana", str3 = "Peach";
        Object integerMax = new MaxFinder(int1, int2, int3).findMax(int1, int2, int3);
        Object floatMax = new MaxFinder(float1, float2, float3).findMax(float1, float2, float3);
        Object stringMax = new MaxFinder(str1, str2, str3).findMax(str1, str2, str3);
        Assertions.assertEquals(6, integerMax, "Validating max method");
        Assertions.assertEquals(6.1f, floatMax, "Validating max method");
        Assertions.assertEquals("Peach", stringMax, "Validating max method");
    }

}
