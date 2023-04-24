package map

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MapTest {

    @Test
    fun getJava() {
        val map = Map()
        val result = map.getJava(JavaType.JAVA_BRONZE)
        assertEquals(result.show(),"JavaBronze")
    }
}