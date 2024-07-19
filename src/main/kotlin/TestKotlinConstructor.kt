class TestKotlinConstructor (name : String) {
    init {
        println("Constructor called with $name")
    }

    constructor(name: String, age: Int) : this(name) {
        println("Constructor called with name: $name and age: $age")
    }

}