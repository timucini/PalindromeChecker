import org.amshove.kluent.shouldBeEqualTo
import org.junit.Test

class TolerantPalindromeCheckerJavaTest {

    private val testChecker = TolerantPalindromeCheckerJava()

    @Test
    fun `"aba" is a palindrome`() {
        testChecker.isTolerantPalindrome("aba") shouldBeEqualTo true
    }

    @Test
    fun `"Aba" is a palindrome`() {
        testChecker.isTolerantPalindrome("Aba") shouldBeEqualTo true
    }

    @Test
    fun `"ab!a" is a palindrome`() {
        testChecker.isTolerantPalindrome("ab!a") shouldBeEqualTo true
    }

    @Test
    fun `"a!ba" is a palindrome`() {
        testChecker.isTolerantPalindrome("a!ba") shouldBeEqualTo true
    }

    @Test
    fun `"a!bcddcba" is a palindrome`() {
        testChecker.isTolerantPalindrome("a!bcddcba") shouldBeEqualTo true
    }

    @Test
    fun `"abcddcb!a" is a palindrome`() {
        testChecker.isTolerantPalindrome("abcddcb!a") shouldBeEqualTo true
    }

    @Test
    fun `"!a" is a palindrome`() {
        testChecker.isTolerantPalindrome("!a") shouldBeEqualTo true
    }

    @Test
    fun `"a!" is a palindrome`() {
        testChecker.isTolerantPalindrome("a!") shouldBeEqualTo true
    }

    @Test
    fun `" aba" is a palindrome`() {
        testChecker.isTolerantPalindrome(" aba") shouldBeEqualTo true
    }

    @Test
    fun `"greetings" is not a palindrome`() {
        testChecker.isTolerantPalindrome("greetings") shouldBeEqualTo false
    }

    @Test
    fun `"1000000001" a palindrome`() {
        testChecker.isTolerantPalindrome("1000000001") shouldBeEqualTo true
    }

    @Test
    fun `"Fish hsif" is a palindrome`() {
        testChecker.isTolerantPalindrome("Fish hsif") shouldBeEqualTo true
    }

    @Test
    fun `"pennep" a palindrome`() {
        testChecker.isTolerantPalindrome("pennep") shouldBeEqualTo true
    }

    @Test
    fun `"p#ennep" a palindrome`() {
        testChecker.isTolerantPalindrome("p#ennep") shouldBeEqualTo true
    }
}