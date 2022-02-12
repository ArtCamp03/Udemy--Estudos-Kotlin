fun main() {
    HelloWord()

    val soma = Sum(45,10)
    println(soma)
}

fun Sum(a:Int, b:Int):Int{
    return a+b
}
fun HelloWord(): Unit {
    println("Ola Mundo !!")
}