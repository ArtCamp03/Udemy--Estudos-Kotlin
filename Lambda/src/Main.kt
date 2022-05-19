// funçao anonima

// sintaxe
// {parametro -> corpo}

fun abc(LAMBDA){
    val s = 1
    LAMBDA()
}

fun main(){
    // exemplo 1
    val a = { } /// lambda vazia
    a() // chamada

    //exemplo 2
    val b = {
        print("Hello !!")
        val s = 1
        val s2 = s * 5
    }
    b()
    receiveA(b)

    // exemplo 3
    val c = {x: Int -> x * x}
    c(20)
    receiveC(c)

    // exemplo 4
    val d = {x: Int, y: Int ->
        println("Executando")
        x * x
    }
    d(10,4)
    receiveD(d)

    // chamada direta
    receiveA{
        println("Tudo ok")
        println("Chamada direta")
    }

}

// () -> Unit
fun receiveA(lambda: () -> Unit) {
    lambda()
}

fun receiveC(tt: (x:Int) -> Int) {}

fun receiveD(lamb: (h1: Int, h2:Int) -> Int) {}