/*
Exec 1
    Escreva uma funçao que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas, minutos, e segundos,
    saida desejada:
    2 anos equivalem a :
    24 meses
    730 dias
    17520 horas
    1051200 minutos

Exec 2
    Escreva uma funçao que receba uma string e retorne a quantidade de caracterres
Exec 3
    Escreva uma funçao capaz de calcular o cubo de um numero inteiro (cubo = n * n * n)
Exec 4
    Escreva uma funçao capaz de receber milhas e converter em km (1 milha = 1.6 km)
Exec 5
    Escreva uma funçao que seja capaz de receber uma string e fazer a troca de todas as letras "a" ou "A" por "x"
    (a) Nao deve existir logica dentro da funçao main, Deve ser usada somente como ponto de entrada
    (b) Escreva uma funçao para a troca de letras e impressao do valor final
    (c) String final deve estar com todas as letras minusculas

Exec 6

 */

fun conversaoAnos(anos: Int) {
    println("$anos ano(s) equivale(m) a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segunds")
}

fun tamanhoString(str: String): Int {
    return str.length
}

fun cubo(n: Int): Int {
    return n * n * n
}

fun milhasEmKm(milhas: Float): Float {
    return milhas * 1.6f
}

fun trocaLetras(str: String): String {
    return str.lowercase().replace("a", "x")
}

fun tamanhoStringUnicaLinha(str: String) = str.length
fun cuboUnicaLinha(n: Int) = n * n * n
fun milhasEmKmUnicaLinha(milhas: Float) = milhas * 1.6f

fun main() {
    conversaoAnos(2)
    println(tamanhoString("Programação Kotlin."))
    println(cubo(2))
    println(milhasEmKm(100f))
}