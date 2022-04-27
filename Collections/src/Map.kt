fun main(){
    // map imutavel
    // map mutavel
    // CHAVE -> VALOR = chave unica

    val map1 = mapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlin"))
    val map2 = mutableMapOf<String, String>(Pair("França", "Paris"), Pair("França", "Berlin"), Pair("Brasil", "Brasilia"))

    println(map1)

    // todas as chaves
    println(map1.entries)

    // todos os valores
    println(map1.values)

    map2["USA"] =  "Washigton"

    println(map2)

    map2.containsKey("Brasil")
    map2.remove("USA")
    println(map2)

    map2.clear()

    println(map2)

}