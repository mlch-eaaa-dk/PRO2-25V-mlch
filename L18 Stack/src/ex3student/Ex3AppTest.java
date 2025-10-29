package ex3student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ex3AppTest {
    @Test
    void isPalindrome_EmptyString() {
        assertTrue(Ex3App.isPalindrome(""));
    }

    @Test
    void isPalindrome_SingleCharacter() {
        assertTrue(Ex3App.isPalindrome("A"));
    }

    @Test
    void isPalindrome_EvenLength() {
        assertTrue(Ex3App.isPalindrome("ABCCBA"));
    }

    @Test
    void isPalindrome_OddLength() {
        assertTrue(Ex3App.isPalindrome("ABCDCBA"));
    }

    @Test
    void isPalindrome_NotPalindrome() {
        assertFalse(Ex3App.isPalindrome("ABCDEF"));
    }

    @Test
    void isPalindrome_IgnoreCase() {
        assertTrue(Ex3App.isPalindrome("AbCdEDcBa"));
    }

    @Test
    void isPalindrome_WithSpaces() {
        assertTrue(Ex3App.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    void isPalindrome_WithPunctuation() {
        assertTrue(Ex3App.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void isPalindrome_WithRepeatedCharacters() {
        assertTrue(Ex3App.isPalindrome("AABAA"));
    }
}
