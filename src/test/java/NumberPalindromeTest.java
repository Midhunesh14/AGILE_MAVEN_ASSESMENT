import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NumberPalindromeTest {
    @Test
    public void testPalindrome() {
        assertTrue(new NumberPalindrome().isPalindrome(121));
    }

    @Test
    public void testNotPalindrome() {
        assertTrue(new NumberPalindrome().isPalindrome(123));
    }

    @Test
    public void testNegativeNumber() {
        assertFalse(new NumberPalindrome().isPalindrome(-121));
    }
}