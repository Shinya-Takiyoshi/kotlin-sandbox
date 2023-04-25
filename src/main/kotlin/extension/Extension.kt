package extension

class Extensions {
    private fun String.addKotlin():String {
        return "$this.kt"
    }

    fun kotlinMessage(str :String):String{
        return str.addKotlin()
    }
}