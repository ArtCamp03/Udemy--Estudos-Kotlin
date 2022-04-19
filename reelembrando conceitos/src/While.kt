/*
    1- Considere uma caixa d´agua de 2 mil litros . Romulo gostaria de encher a caixa com baloes d´agua
    de 7 litros . Quantos baloes cabem na caixa d´agua sem que o volume seja excedido/

    2 - FizzBuzz , imprima os numeros de 1 a 50 em ordem crescente de acordo coma as regras abaixo
        a) Quando o numero for divisivel por 3 imprima Buzz
        b) Quando o numero for divisivel por 5 imprima Fizz
        c) Quando o numero for divisivel por 3 e 5 imprima FizzBuzz

     3 - Escreva um programa capaz de receber um texto e imprimilo invertido

     4 - Escreva uma funçao que receba uma string, verifica se existe a mesma quantidade de caracteres
     'x' e 'o' e retorna true ou false . Caso nao exista nem X nem O retorna false.
 */
fun main(){
    // exec1()
    // exec2()
    // exec3("Meu nome é Silver")
   print(exec4("Tudo x"))
}

fun exec1(){
    var baloes = 7
    var caixa = 2000
    var litro = 0
    var cont = 0
    while((cont * baloes) + baloes < caixa){
        litro += baloes
        cont++
    }
    print("quantidade de baleos é $cont")
}

fun exec2(){
    var i = 1
    while(i < 50){
        if(i % 3 == 0){
            println("Buzz")
        }else if(i % 5 == 0){
            println("Fizz")
        }else if(i % 3 == 0 && i % 5 == 0) {
            println("BuzzFizz")
        }
        i++
    }
}

fun exec3(str: String){
    var i = str.length
    while(i > 0){
        print(str[i-1])
        i--
    }
}

fun exec4(str:String): Boolean{
    val strLower = str.lowercase()
    var i = str.length
    var j = 0
    var letraO = 0
    var letraX = 0
    while(j < i){
        if(str[j] == 'o'){
            letraO++
        }else if(str[j] == 'x'){
            letraX++
        }
        j++
    }
    return (letraX == letraO) && letraX != 0

}

