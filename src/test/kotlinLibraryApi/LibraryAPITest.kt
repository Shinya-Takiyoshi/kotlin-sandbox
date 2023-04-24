package kotlinLibraryApi

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import vararg.Vararg

class LibraryAPITest {

    @Test
    fun applyAPI() {
        val libraryAPI = LibraryAPI()
        val result = libraryAPI.applyAPI()
        assertEquals(5,result.sumReturn(2 ,3))
    }

    @Test
    fun letAPI() {
        val libraryAPI = LibraryAPI()
        val result = libraryAPI.letAPI(2)
        assertEquals("2",result)
    }

    @Test
    fun runAPI() {
        val libraryAPI = LibraryAPI()
        val result = libraryAPI.runAPI("123456789")
        assertEquals(false,result)
    }

    @Test
    fun withAPI() {
        //runに似てるが呼び出し方の違いがある
        val libraryAPI = LibraryAPI()
        val result = libraryAPI.withAPI("123456789")
        assertEquals(false,result)
    }

    @Test
    fun alsoAPI() {
        val libraryAPI = LibraryAPI()
        val result = libraryAPI.alsoAPI("123456789")
        assertEquals("123456789",result)
    }

    @Test
    fun takeIfAPI() {
        val libraryAPI = LibraryAPI()
        val result = libraryAPI.takeIfAPI("12345")
        assertEquals(5,result)
    }
}