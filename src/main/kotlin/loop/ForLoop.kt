package loop

class ForLoop {
    fun indexLoop(): Unit {
        //通常for文
        for (i in 1..3) {
            println("通常for文:${i}")
        }
    }

    fun exLoop(): Unit {
        //拡張for文
        val list = listOf(1, 2, 3)
        for (i in list) {
            println("拡張for文:${i}")
        }
    }

    fun eachLoop(): Unit {
        //forEach関数
        val list = listOf(1, 2, 3)
        list.forEach { index -> println("forEach:${index}") }
    }

    fun eachIndexLoop(): Unit {
        //index+要素で取得できる方法
        val list = listOf("shelly", "bourbon", "jin")
        list.forEachIndexed { index, data -> println("forEach:${index}:${data}") }
    }
}