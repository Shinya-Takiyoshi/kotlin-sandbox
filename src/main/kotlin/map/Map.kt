package map

class Map {
    fun getJava(javaType: JavaType): Java {
        val factory = JavaFactory()
        return factory.of(javaType)
    }
}