// utilizando o SET
// SET nao eh um conjunto ordenado
// set -> nao permite variavel repetida
// SET -> e so conjunto nao possui indice

fun main() {
    val set1 : Set<String> = setOf<String>("Berlin", "Luis", "Paris")
    val set2 : MutableSet<String> = mutableSetOf<String>()

    println(set1)

    set1.add("Sao Paulo")
    set1.remove("Luis")
    println(set1.contains("Sao Paulo"))

    println(set1)
}

