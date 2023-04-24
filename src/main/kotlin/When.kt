class When {
    fun whenExpression(a: String): Unit {
        when (a) {
            "kotlin" -> println("kotlinが渡されました")
            "java" -> println("javaが渡されました")
            else -> {
                //ブロックにすると、複数行処理がかける
                println("kotlinでもjavaでもありません")
            }
        }

    }
}