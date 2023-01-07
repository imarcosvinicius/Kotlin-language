package dio.oop

open class Dog {
    open fun sayHello() {
        println("wow wow!")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("wif wif!")
    }
}

class Caramel: Dog() {
    override fun sayHello() {
        println("au-au au-au")
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    val caramel: Dog = Caramel()
    caramel.sayHello()
    dog.sayHello()
}