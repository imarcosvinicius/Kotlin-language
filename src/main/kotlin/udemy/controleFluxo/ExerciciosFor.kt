package udemy.controleFluxo

/*
1 - Imprima os números de 1 a 50 na mesma linha em ordem crescente. Saída esperada:
“1 2 3 4 5 6 7 8 9 10 .. .. .. 49 50”
1
2 - Imprima os números de 1 a 50 na mesma linha em ordem decrescente. Saída esperada:
“50 49 48 47 .. .. .. 2 1”
3 - Usando a resolução do exercício 1, não imprima os números múltiplos de 5.
4 - Faça a soma de todos os números no intervalo de 1 a 500.
5 - Escreva um programa capaz de receber um número inteiro N e imprimir uma escada de tamanho N usando
o caracter #.
Se a entrada do programa for 3, teremos:
#
##
###
Se a entrada do programa for 5, teremos:
#
##
###
####
#####*/
fun main() {
    //exe1()
    //exe2()
    //exe3()
    //exe4()
    exe5(9)
}

fun exe5(num: Int) {

    for (i in 1..num){
        for (j in 1..i) {
            print("#")
        }
        println()
    }

}

fun exe4() {
    var a = 0
    for (i in 1..500) {
        a += i
    }
    print(a)
}

fun exe3() {
    for (i in 1..50) {
       if (i % 5 == 0)
           continue
        else
            print("$i ")
    }
}

fun exe2() {
    for (j in 50 downTo 1) {
        print("$j ")
    }
}

fun exe1() {
    for (i in 1..50) {
        print("$i ")
    }
}
