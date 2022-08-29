import org.amshove.kluent.shouldBeEqualTo
import org.junit.Test

class PalindromeCheckerJavaTest {

    private val testCheckerJava = PalindromeCheckerJava()

    @Test
    fun `"aba" is a palindrome`() {
        testCheckerJava.isPalindrome("aba") shouldBeEqualTo true
    }

    @Test
    fun `"Aba" is not a palindrome`() {
        testCheckerJava.isPalindrome("Aba") shouldBeEqualTo false
    }

    @Test
    fun `" aba" is not a palindrome`() {
        testCheckerJava.isPalindrome(" aba") shouldBeEqualTo false
    }

    @Test
    fun `"aba " is not a palindrome`() {
        testCheckerJava.isPalindrome("aba ") shouldBeEqualTo false
    }

    @Test
    fun `"greetings" is not a palindrome`() {
        testCheckerJava.isPalindrome("greetings") shouldBeEqualTo false
    }

    @Test
    fun `"1000000001" a palindrome`() {
        testCheckerJava.isPalindrome("1000000001") shouldBeEqualTo true
    }

    @Test
    fun `"Fish hsif" is not a palindrome`() {
        testCheckerJava.isPalindrome("Fish hsif") shouldBeEqualTo false
    }

    @Test
    fun `"pennep" a palindrome`() {
        testCheckerJava.isPalindrome("pennep") shouldBeEqualTo true
    }

    @Test
    fun `"pen#nep" a palindrome`() {
        testCheckerJava.isPalindrome("pen#nep") shouldBeEqualTo true
    }

}