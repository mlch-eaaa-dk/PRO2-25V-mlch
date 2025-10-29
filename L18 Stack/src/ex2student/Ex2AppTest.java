package ex2student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ex2AppTest {

    @Test
    void testIsBalancedEmptyString() {
        assertTrue(Ex2App.isBalanced(""));
    }

    @Test
    void testIsBalancedWithSimpleParentheses() {
        String input = "()";
        boolean result = Ex2App.isBalanced(input);
        assertTrue(result);
    }

    @Test
    void testIsBalancedWithUnbalancedParentheses() {
        String input = "((())";
        assertFalse(Ex2App.isBalanced(input));
    }

    @Test
    void testIsBalancedWithNestedBalancedBrackets() {
        String input = "({[]})";
        boolean result = Ex2App.isBalanced(input);
        assertTrue(result);
    }

    @Test
    void testIsBalancedWithMismatchedBrackets() {
        String input = "([)]";
        assertFalse(Ex2App.isBalanced(input));
    }

    @Test
    void testIsBalancedComplexString() {
        String complexBalancedString = "({[]})()[]{}";
        assertTrue(Ex2App.isBalanced(complexBalancedString));
    }

    @Test
    void testIsBalancedWithNonBracketCharacters() {
        String input = "a(b)c[d]e{f}";
        assertTrue(Ex2App.isBalanced(input));
    }

    @Test
    void testIsBalancedWrongOrder() {
        assertFalse(Ex2App.isBalanced(")("));
    }
}
