fun main(){
    println(media1(25f,14f))
    println(media2(28f,14f,3,"hoje"))

    // permite a passagem de qualuer parametro
    // Conjunto de elementos
    arrayOf(1,2,3,4,"f")
}

// quando varag esta no parametro ele tem qe ser util
fun media1(vararg notas: Float): Float{
    var soma = 0f
    for(n in notas){
        soma += n
    }
    return (soma/notas.size)
}

// funcao generica utilizando generics
fun <T> media2(vararg notas: T): Float{
    var soma = 0f
    for(n in notas){
        if(n is Float){
            soma += n
        }else if(n is String){
            println("String")
        }

    }
    return (soma/notas.size)
}