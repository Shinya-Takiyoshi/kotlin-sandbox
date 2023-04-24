package kotlinLibraryApi

import vararg.Vararg

class LibraryAPI {
    fun applyAPI():Vararg{
        //インスタンス生成してそのまま処理することができる
        return Vararg().apply {
            sumReturn()
        }
    }

    fun letAPI(i :Int?): String? {
        //letはnullの場合、返さないためnullでないことが保証される
        return i?.let {
            it.toString()
        }
    }

    private fun isOverTen(str:String) = str.length > 10
    fun runAPI(runStr :String):Boolean{
        return runStr.run (::isOverTen)
    }
    fun withAPI(withStr :String): Boolean {
        return with(withStr, ::isOverTen)
    }
    fun alsoAPI(alsoStr :String):String{
        return alsoStr.also { it.length }
    }
    fun takeIfAPI(takeIfStr :String):Int?{
        return takeIfStr.takeIf { it.length == 5 } ?.length
    }
}