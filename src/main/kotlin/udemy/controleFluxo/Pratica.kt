package udemy.controleFluxo

/*
1 - Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no final
do ano. Os bônus são classificados por cargo.
a. Gerentes recebem R$ 2.000,00
b. Coordenadores recebem R$ 1.500,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00

2- Modifique o primeiro exercício para considerar o tempo de experiência no cálculo de bônus.
a. Gerentes com menos de 2 anos de experiência recebem R$ 2.000,00, caso contrário recebem R$ 3.000,00
b. Coordenadores com menos de 1 ano de experiência recebem R$ 1.500,00, caso contrário recebem R$ 1.800,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00

3- Qual o resultado das comparações abaixo?
a. (a && b && c && d)
a = false b = false c = true d = true
b. (!a && !b && (c && d))
a = false b = false c = true d = true
c. (a && ((b || c) || d))
a = false b = false c = true d = true
d. (a || ((!b && c) || !d))
 */
fun main() {

    val a = false
    val b = false
    val c = true
    val d = true

    println(a && b && c && d)
    // false

    println(!a && !b && (c && d))
    // true

    println(a && ((b || c) || d))
    // false

    println(a || (!b && c ) || !d)
    // true

}

fun bonusEx(cargo: String, experiencia: Int): Float {
    var bonus = 0f
    if (cargo == "Gerente") {
        bonus = if (experiencia < 2) 2000f else 3000f
    } else if (cargo == "Coordenador") {
        bonus = if (experiencia < 1) 1500f else 1800f
    } else if (cargo == "Engenheiro de Software") bonus = 1000f
    else if (cargo == "Estagiário") bonus = 500f

    return bonus

}

fun bonus(cargo: String): Float {
    var bonus = 0f
    if (cargo == "Gerente") {
        bonus = 2000f
    } else if (cargo == "Coordenador") {
        bonus = 1500f
    } else if (cargo == "Engenheiro de Software") {
        bonus = 1000f
    } else if (cargo == "Estagiário") {
        bonus = 500f
    }

    return bonus

}