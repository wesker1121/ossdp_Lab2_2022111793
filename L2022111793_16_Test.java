import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class L2022111793_16_Test {
    private final Solution solution = new Solution();

    @Test
    public void testExample1() {
        int[] nums = {10, 2};
        String expected = "210";
        assertEquals(expected, solution.largestNumber(nums));
    }

    @Test
    public void testExample2() {
        int[] nums = {3, 30, 34, 5, 9};
        String expected = "9534330";
        assertEquals(expected, solution.largestNumber(nums));
    }

    @Test
    public void testSingleNumber() {
        int[] nums = {1};
        String expected = "1";
        assertEquals(expected, solution.largestNumber(nums));
    }

    @Test
    public void testMultipleZeros() {
        int[] nums = {0, 0};
        String expected = "0";
        assertEquals(expected, solution.largestNumber(nums));
    }

    @Test
    public void testLargeNumbers() {
        int[] nums = {999, 99, 9};
        String expected = "999999";
        assertEquals(expected, solution.largestNumber(nums));
    }

    @Test
    public void testEdgeCaseWithZeroAndLargeNumber() {
        int[] nums = {0, 100, 1000};
        String expected = "10010000";
        assertEquals(expected, solution.largestNumber(nums));
    }
}
