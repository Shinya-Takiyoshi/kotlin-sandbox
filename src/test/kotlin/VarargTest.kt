import org.junit.jupiter.api.Test
import vararg.Vararg

class VarargTest {

    @Test
    fun sumReturn() {
        val vararg = Vararg()
        val result = vararg.sumReturn(2,3)
        assert(result == 5)
    }

    @Test
    fun sumReturnSplet() {
        //スプレット演算子を用いた場合
        val vararg = Vararg()
        val list = intArrayOf(4,5)
        val result = vararg.sumReturn(2,*list,3)
        assert(result == 14)
    }

    @Test
    fun sumPairReturn() {
        //Pairで2つ戻り値を戻す
        val vararg = Vararg()
        val list = intArrayOf(4,5)
        val result = vararg.sumPairReturn(2,*list,3)
        assert(result == Pair(14,1.4))
    }

    @Test
    fun sumTripleReturn() {
        //Tripleで3つ戻り値を戻す
        val vararg = Vararg()
        val list = intArrayOf(4,5)
        val result = vararg.sumTripleReturn(2,*list,3)
        assert(result == Triple(14,1.4,15))
    }

}