// Any, Unit, Nothing

// todos os tipos sao decendentes de Any
fun main(){
    // permite qualquer tipo de dados
    valores(false)
}

fun valores(value: Any){

}

// Unit detona qe a funbçao nao tem retorno
// Unit pode ou nao ser declarado , por padrao o kotlin ja reconhece em uma funçao
fun valores2(vec: Any):Unit{

}

// eh um tipo de dado porem nao tem retorno
// caso mais frequente de uso quando quer retornar uma excessao de funçao
fun valores3(vec: Any):Nothing{

}

// Ex: nothing
fun save():Nothing{
    TODO()"Nao houve tempo."
}

fun update():Nothing{
    TODO()"Nao houve tempo."
}