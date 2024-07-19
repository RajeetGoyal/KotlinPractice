package data

data class Employee(val name: String = "Rajeet", val department: String, val salary: Int)

fun main() {
    val employee1 = Employee(department="STG", salary=1000000)
    println(employee1)
    val employee2 = Employee(name="Shivam", "STG", 1000000)
    println(employee2)
}
