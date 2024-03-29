package top.L20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void case1() {
        Solution solution = new Solution();
        Assertions.assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    public void case2() {
        Solution solution = new Solution();
        Assertions.assertFalse(solution.isValid("(]"));
    }

    @Test
    public void case3() {
        Solution solution = new Solution();
        Assertions.assertFalse(solution.isValid("("));
    }
}