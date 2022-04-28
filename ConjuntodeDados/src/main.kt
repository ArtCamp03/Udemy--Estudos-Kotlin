fun main() {
    //Any e Caunt

    val data = geraDados()

    println(data.any())
    println(listOf<Int>().any())
    //ou

    println("Tenho dados? ${if(data.any()) "sim" else "nao"} ")
    println("Tenho elementos ${data.count()} elementos.")

    // objeto da primeira receita
    println("Primeira Receita: ${data.first().nome}")

    // objeto da ultima receita
    println("Ultima Receita: ${data.last().nome}")

    println(listOf<Int>().firstOrNull())
    println(listOf<Int>().lastOrNull())

    // sum -> soma apenas numeros
    println(listOf<Int>().sum())

    // sumOf soma uma propriedade especifica

    println(data.sumOf { it.calorias })

    // filter
    data.filter { it.nome == "Lasanha" }

    println(
        data.any { it.calorias > 500 }
    )

}

fun geraDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Mussarela", 6),
                Ingrediente("Tomate", 8),
                Ingrediente("Cebola", 2),
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente(val nome: String, val quantidade: Int)