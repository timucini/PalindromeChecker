import org.amshove.kluent.shouldBeEqualTo
import org.junit.Test

class PalindromeCheckerKotlinTest {

    private val testChecker = PalindromeCheckerKotlin()

    @Test
    fun `"aba" is a palindrome`() {
        testChecker.isPalindrome("aba") shouldBeEqualTo true
    }

    @Test
    fun `"Aba" is a palindrome`() {
        testChecker.isPalindrome("Aba") shouldBeEqualTo false
    }

    @Test
    fun `" aba" is not a palindrome`() {
        testChecker.isPalindrome(" aba") shouldBeEqualTo false
    }

    @Test
    fun `"aba " is not a palindrome`() {
        testChecker.isPalindrome("aba ") shouldBeEqualTo false
    }

    @Test
    fun `"greetings" is not a palindrome`() {
        testChecker.isPalindrome("greetings") shouldBeEqualTo false
    }

    @Test
    fun `"1000000001" a palindrome`() {
        testChecker.isPalindrome("1000000001") shouldBeEqualTo true
    }

    @Test
    fun `"Fish hsif" is not a palindrome`() {
        testChecker.isPalindrome("Fish hsif") shouldBeEqualTo false
    }

    @Test
    fun `"pennep" a palindrome`() {
        testChecker.isPalindrome("pennep") shouldBeEqualTo true
    }

    @Test
    fun `"pen#nep" a palindrome`() {
        testChecker.isPalindrome("pen#nep") shouldBeEqualTo true
    }
}