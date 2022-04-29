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

    // Take(pega primerios) e Takelast(pega ultimos)
    println(data.take(2))
    println(data.takeLast(2))

    // forEach
    data.forEach { println(it.nome)}

    println("calorias maiores que 500")
    data.filter {it.calorias > 500}.forEach {println(it.nome)}

    // MAX e MIN -> retorna somente o numero
    print("Mais calorias:")
    println(data.maxOf { it.calorias })

    print("Menos calorias:")
    println(data.minOf { it.calorias })

    listOf(1, 2,4).maxOf { it }
    listOf(1, 2,4).maxOfOrNull { it }

    listOf(1, 2,4, 9, 0).minOf { it }
    listOf(1, 2,4,7 ).minOfOrNull { it }

    // maxBy retorna o objeto
    println(data.maxByOrNull { it.calorias })

    // map cria outra lista com os elementos modificados
    println(data.map {it.calorias}.sum())

    // average
    // media das calorias das receitas
    listOf(12, 15, 18, 20).average()
    data.app { it.calorias }.average()

    // distinct, sorted, e reversed
    val lst = listOf(1, 3, 5, 7, 35, 16, 19)
    println(lst.distinct())

    // elementos distintos
    println(data.distinctBy { it.nome })  // se for somente (it) ele analisa o objeto todo

    // sorted ordena para o maior
    println(lst.sorted())
    println(lst.sortedDescending())

    println(lst.reversed())
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