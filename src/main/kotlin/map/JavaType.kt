package map


enum class JavaType {
    JAVA_BRONZE {
        override val className: String
            get() = "JavaBronze"
    },
    JAVA_SILVER {
        override val className: String
            get() = "JavaSilver"
    },
    JAVA_GOLD {
        override val className: String
            get() = "JavaGold"
    };

    abstract val className: String
}
