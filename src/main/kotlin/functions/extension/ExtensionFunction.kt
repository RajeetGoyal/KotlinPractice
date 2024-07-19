package functions.extension

var str = "Hi, there"

fun String.addExclamation(): String {
    return "$this!";
}

fun main() {
    val updatedString = str.addExclamation();
    println(updatedString)
}