class If {
    fun ifExpression(s: String): Unit {
        var msg = if (s == "kotlin") {
            "kotlin"
        } else if (s == "java") {
            "java"
        } else {
            "other"
        }
        println(msg)
    }
}