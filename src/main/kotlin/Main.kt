import loop.ForLoopRange

fun main(args: Array<String>) {
    val range = ForLoopRange()
    println("==untilLoop==")
    range.untilLoop()
    println("")
    println("==downToLoop==")
    range.downToLoop()
    println("")
    println("==stepLoop==")
    range.stepLoop()
    println("")
    println("==outerBreak==")
    range.outerBreak()
    println("")
    println("==notOuterBreak==")
    range.notOuterBreak()
}