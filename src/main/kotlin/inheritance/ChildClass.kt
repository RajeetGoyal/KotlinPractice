package inheritance

class ChildClass(private val name : String) : ParentClass() {

    override fun parentMethod() {
        println("Hi there, I am the child method! My name is $name")
    }
}