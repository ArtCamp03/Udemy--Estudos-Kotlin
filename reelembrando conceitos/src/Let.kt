// Let utilizado para executar metodos disponiveis pela variavel quando a mesma for diferente de nulo

fun main(){
    var str:String? = null

    str?.let {
        // corpo
        // escopo de funçao
        // variavel passa a ser referenciada como it
        it.lowercase()
        it.length
    }
}