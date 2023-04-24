class Vararg {
    fun sumReturn(vararg values: Int): Int {
        var result = 0
        for (value in values) {
            result += value
        }
        return result
    }

    fun sumPairReturn(vararg values: Int): Pair<Int, Double> {
        var result = 0
        for (value in values) {
            result += value
        }
        return Pair(result, result / 10.0)
    }

    fun sumTripleReturn(vararg values: Int): Triple<Int, Double, Int> {
        var result = 0
        for (value in values) {
            result += value
        }
        return Triple(result, result / 10.0, result + 1)
    }

}