package top.L169;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void case1() {
        Solution solution = new Solution();
        Assertions.assertEquals(solution.majorityElement(new int[]{3, 2, 3}), 3);
        Assertions.assertEquals(solution.majorityElement1(new int[]{3, 2, 3}), 3);
    }

    @Test
    public void case2() {
        Solution solution = new Solution();
        Assertions.assertEquals(solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}), 2);
        Assertions.assertEquals(solution.majorityElement1(new int[]{2, 2, 1, 1, 1, 2, 2}), 2);
    }
}