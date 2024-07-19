import data.Employee
import inheritance.ChildClass
import inheritance.ParentClass

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val result = TestKotlinClass.myStaticMethodName()
    println(result)

    TestKotlinSingleton.myMethodName()

    myMethodName()

    TestKotlinConstructor("Rajeet", 28)

    var emp = Employee("Rajeet", "STG", 80000)
    println(emp)

    var parentClass = ParentClass()
    parentClass.parentMethod()

    var childClass = ChildClass("Child class")
    childClass.parentMethod()

    val name = "Rajeet"
    println("My name is $name")
}