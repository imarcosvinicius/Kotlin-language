package udemy.controleFluxo

fun main() {
    val salario = 10000f
    var patAna = 0f
    var patPaula = 0f
    var mes = 0
    do {
        patAna += (salario * 0.05f) + (salario * 0.05f) + (patAna * 0.002f)
        patPaula += (salario * 0.05f) + (patPaula * 0.008f)
        mes++

        println("Patrimônio Ana: $patAna --- Paula: $patPaula")
    } while (patAna > patPaula)

    println("Ana : ${patAna * 0.002f}")
    println("Paula : ${patPaula * 0.008f}")
    println("Paula vai passar o patrimônio de Ana no mês: $mes.")
}