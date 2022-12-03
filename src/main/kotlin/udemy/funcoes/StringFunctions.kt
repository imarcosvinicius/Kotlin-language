package udemy.funcoes

fun main() {
    val str = "Kotlin Language"

    println("Tamanho da string: ${str.length}")
    println("Posição 0 da string: ${str[0]}")
    println(str.startsWith("Ko"))
    println(str.endsWith("abc"))
    println(str.substring(2,12))
    println(str.replace("Language", "Android"))
    // .trim() remove espaços em branco
}