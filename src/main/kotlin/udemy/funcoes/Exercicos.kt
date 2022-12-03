package udemy.funcoes

/*
1 - Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas,
minutos e segundos. Saída desejada:
2 anos equivalem a:
24 meses
730 dias
17520 horas
1051200 minutos
63072000 segundos

2 - Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres.

3 - Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n).

4 - Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6km).

5 - Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras “a” ou “A” por “x”.
a. Não deve existir lógica dentro da função main. Deve ser usada somente como ponto de entrada.
b. Escrever uma função para a troca de letras e impressão do valor final.
c. String final deve estar com todas as letras minúsculas.

6 - Sobre as funções criadas nos exercícios 2, 3 e 4. É possível transformá-las em funções de uma única linha? Se
sim, transforme-as.
 */

fun main() {
    convertYears(2)
    caracters("Pastel")
    calcCubo(3)
    MilesKm(100f)
    repleaseStr("RAPADURA")
}

fun repleaseStr(str: String) = println(str.replace("a", "x", true).lowercase())

fun MilesKm(miles: Float) = println("$miles milhas tem ${miles * 1.6} KM's")

fun calcCubo(number : Int) = println(number * number * number)

fun caracters(str: String) = println(str.length)

fun convertYears(years: Int) {
    println("$years anos equivalem a: ")
    println("${years * 12} meses")
    println("${years * 365} dias")
    println("${years * 365 * 24} horas")
    println("${years * 365 * 24 * 60} minutos")
    println("${years * 365 * 24 * 60 * 60} segundos")
}
