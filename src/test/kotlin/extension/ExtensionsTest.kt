package extension
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ExtensionsTest {
    @Test
    fun kotlinMessage() {
        val extensions = Extensions()
        val result = extensions.kotlinMessage("Extensions")
        assertEquals("Extensions.kt",result)
    }
}