package collections

class Collections {

    var list = listOf<Int>(1, 2, 3, 4, 5);
}

fun main() {
    val collections = Collections()
    println(collections.list)

    var newList = collections.list
}