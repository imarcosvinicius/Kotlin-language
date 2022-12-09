package udemy.controleFluxo

fun main() {
    println(saudacao(true))
}

fun saudacao(dia: Boolean): String {
    return if (dia)
        "Bom dia"
    else
        "Boa noite"
}