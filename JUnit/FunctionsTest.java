import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionsTest {

    Functions f = new Functions();

    @Test
    @DisplayName("isAnagram alma-alma is true")
    void isAnagramShouldByTrue() {
        assertTrue(f.isAnagram("alma", "alma"));
    }

    @Test
    @DisplayName("isAnagram alma-alba is false")
    void isAnagramShouldByFalse2() {
        assertFalse(f.isAnagram("alma", "alba"));
    }

    @Test
    @DisplayName("isAnagram greek-Greek is true")
    void isAnagramShouldByTrue3() {
        assertTrue(f.isAnagram("greek", "Greek"));
    }

    @Test
    @DisplayName("isAnagram peak-keep is false")
    void isAnagramShouldByFalse4() {
        assertFalse(f.isAnagram("peak", "keep"));
    }

    @Test
    @DisplayName("fibonacci 0 -> 0")
    void fibonacci0() {
        assertEquals(0, f.fibonacci(0));
    }

    @Test
    @DisplayName("fibonacci 1 -> 1")
    void fibonacci1() {
        assertEquals(1, f.fibonacci(1));
    }

    @Test
    @DisplayName("fibonacci 2 -> 1")
    void fibonacci2() {
        assertEquals(1, f.fibonacci(2));
    }

    @Test
    @DisplayName("fibonacci 4 -> 3")
    void fibonacci4() {
        assertEquals(3, f.fibonacci(4));
    }

    @Test
    @DisplayName("fibonacci 8 -> 21")
    void fibonacci8() {
        assertEquals(21, f.fibonacci(8));
    }

    @Test
    @DisplayName("countLetters apa -> 2")
    void countLettersApa() {
        assertEquals(2, f.countLetters("apa"));
    }

    @Test
    @DisplayName("countLetters ' ' -> 0")
    void countLettersSpace() {
        assertEquals(0, f.countLetters(" "));
    }

    @Test
    @DisplayName("countLetters '' -> 0")
    void countLettersNone() {
        assertEquals(0, f.countLetters(""));
    }

    @Test
    @DisplayName("countLetters aaAaa -> 1")
    void countLettersAaAaa() {
        assertEquals(1, f.countLetters("aaAaa"));
    }
}
