package loop

class ForLoopRange {
    fun untilLoop() {
        //until
        for (i in 1 until 3) {
            println("untilは最後を含めない:${i}")
        }
    }

    fun downToLoop() {
        //downTo
        for (i in 3 downTo 1) {
            println("1ずつ減らす:${i}")
        }
    }

    fun stepLoop() {
        //skip
        for (i in 1..20 step 3) {
            println("3飛びで進む:${i}")
        }
    }

    fun outerBreak() {
        //ラベル構文
        outer@
        for (i in 1..10) {
            for (j in 1..10) {
                if (j > 5) break@outer
                println("i:${i} j:${j}")
            }
        }
    }

    fun notOuterBreak() {
        //ラベル構文なしのbreak
        for (i in 1..5) {
            for (j in 1..5) {
                if (j > 2) break
                println("i:${i} j:${j}")
            }
        }
    }
}