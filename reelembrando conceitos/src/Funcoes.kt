import kotlin.math.*

fun main() {
    HelloWord()
    HelloWorD()

    val soma = Sum(45,10)

    val soma2 = SuM(60,10)

    val div = divisao(45.0f, 20.0f)

    println(soma)

    println(soma2)

    println(div)

    maiorValor(10,50)
}

fun Sum(a:Int, b:Int):Int{
    return a+b
}
fun HelloWord(): Unit {
    println("Ola Mundo !!")
}

// instruçoes sao funçoes escritas em uma unica linha

fun HelloWorD() = println("Ola Mundo !!")

fun SuM(a:Int, b:Int):Int = (a+b)

fun divisao(a:Float, b:Float) = a/b

// funçoes do dia a dia

fun maiorValor(a:Int, b:Int){
    println("Maior valor: ")
    println(max(a,b))
    println(min(a,b))
    println(sqrt(45.4f))
    println(PI)
    println(E)
    println(round(45.123132))
    
}