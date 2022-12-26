package udemy.controleFluxo

fun main() {
    //caixaDagua()
    //fizzBuzz()
    //invertName("Meu nome é Julius.")
    println(caracterXY("xxooox"))  // true
    println(caracterXY("xxxxo"))  // false
    println(caracterXY("bdefghjij"))  // false
    println(caracterXY("ooooxzzzzz"))  // false
}

fun caracterXY(str: String): Boolean {

    val strLower = str.lowercase()
    var countX = 0
    var countO = 0

    var i = 0
    while (i < strLower.length) {
        if (strLower[i] == 'x') {
            countX++
        } else if (strLower[i] == 'o') {
            countO++
        }
        i++
    }
    return (countX == countO) && (countX != 0)
}

fun invertName(str: String) {
    var i = str.length - 1
    while (i >= 0) {
        print(str[i])
        i--
    }
}

fun fizzBuzz() {
    var i = 1
    while (i in i..50) {
        if (i % 15 == 0) {
            print("FizzBuzz ")
        } else if (i % 3 == 0) {
            print("Buzz ")
        } else if (i % 5 == 0) {
            print("Fizz ")
        } else {
            print("$i ")
        }
        i++
    }
}

fun caixaDagua() {
    val capCaixa = 2000
    val capbBalao = 7
    var qntBalao = 0
    while ((qntBalao * capbBalao) + capbBalao < capCaixa) {
        qntBalao++
    }
    println("Cabem $qntBalao balões na caixa d'água")
}
