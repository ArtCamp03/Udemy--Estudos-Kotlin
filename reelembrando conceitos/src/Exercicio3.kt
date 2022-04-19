/*
Exec 1
    Escreva um programa capz de ler os dois numeros inteiros que representam os lados de uma figura
    geometrica informar se formam um quadrado (lados iguais)
Exec 2
    Escreva um programa capaz de ler os 3 numeros inteiros que representam os lados de um triangulo
    informar se é um triangulo equilatero (todos os lados iguais)

Exec 3
    Considere o codigo abaixo qual a saida do programa caso informado o valor 4?

    fun qualASaida(num: Int){
        if(num >= 0){
            if(num == 0){
                println("Primeiro string")
             }else{
                println("Segunda string)
              }
         }
         println("terceira string)

Exec 4
    Escreva um programa para ser usado na portaria de um evento
        a. Faça a idade. Menores de idade nao sao permitidos. Mensagem: "Negado, Menores de idade nao sao
            permitidos"
         b. Peça o tipo de convite. Os tipos de convite sao comum, premium e luxo. Negar a entrada caso nao
            seja nenhum deles. Mensagem : "Negado, Convite Invalido"
         c. Peça o codigo do convite. Convites premium e luxo começam com "XL" . Convites comuns começam com
            "XT". Caso o codigo nao esteja nos padroes , negar a entrada. Mensagem : "Negado. Convite Invalido"
         d. Caso todos os criterios sejam satisfeitos, exibir "Welcome :)"

Exec 5
 */

fun main(){

}

fun ex1() {
    print("Informe o primeiro valor: ")
    val lado1 = readLine()

    print("Informe o segundo valor: ")
    val lado2 = readLine()

    if (lado1 != "" && lado2 != "") {
        if (lado1 == lado2) {
            println("Quadrado")
        } else {
            println("Retângulo")
        }
    }
}

fun ex2() {
    print("Informe o primeiro valor: ")
    val lado1 = readLine()

    print("Informe o segundo valor: ")
    val lado2 = readLine()

    print("Informe o terceiro valor: ")
    val lado3 = readLine()

    if (lado1 != "" && lado2 != "" && lado3 != "") {
        if ((lado1 == lado2) && (lado2 == lado3)) {
            println("Equilátero")
        } else {
            println("Isósceles ou escaleno")
        }
    }
}

fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0)
            println("Primeira string")
        else println("Segunda string")
    }
    println("Terceira string")
}

fun portaria() {
    print("Qual sua idade? ")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos.")
            return
        }
    }

    print("Qual é o tipo de convite? ")
    var tipoConvite = readLine()

    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()

        // Validação do tipo de convite
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. Convite inválido.")
            return
        }

        print("Qual o código do convite? ")
        var codigo = readLine()

        if (codigo != null && codigo != "") {
            codigo = codigo.lowercase()

            if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                println("Welcome :)")
            } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")
            ) {
                println("Welcome :)")
            } else {
                println("Negado. Convite inválido")
            }
        }
    }
}