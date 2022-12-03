package udemy.funcoes

fun main() {
    val num1 = 19
    val num2 = 22
    val divisao = div(10f, 3.5f)
    helloWorld()

    println("A soma entre $num1 e $num2 é ${sum(num1,num2)}")
    println("A divisão entre 10 e 3.5 é $divisao")
}

//Inline function
fun sum(a: Int, b: Int): Int = a + b

fun helloWorld() = println("Hello, World!")

fun div(a: Float, b: Float): Float {
    return a / b
}