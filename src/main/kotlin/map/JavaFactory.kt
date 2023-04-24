package map

import org.jetbrains.annotations.NotNull
import kotlin.collections.Map

class JavaFactory {
    private val javaTypes: Map<JavaType, Java> = object : HashMap<JavaType, Java>() {
        init {
            put(JavaType.JAVA_BRONZE, JavaBronze())
            put(JavaType.JAVA_SILVER, JavaSilver())
            put(JavaType.JAVA_GOLD, JavaGold())
        }
    }

    @NotNull
    fun of(javaType: JavaType): Java {
        return javaTypes[javaType]!!
    }
}
