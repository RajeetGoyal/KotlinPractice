package flow

fun main() {
    for (i in 1..10) {
        println(i);
    }

    println(whenTest(3))
}


fun whenTest(x: Int) = when (x) {
    1 -> "one"
    2 -> "two"
    else -> "unknown"
}