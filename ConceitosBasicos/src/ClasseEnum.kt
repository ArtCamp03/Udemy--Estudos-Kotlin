enum class Prioridade(var id: Int){
    Baixa(1){
        override fun toString(): String {
            return "Prioridade Baixa: $id"
        }
            },
    Media(5),
    Alta(15)

}

//enum limita o numero de valores
enum class AnimalEnum{
    Cachorro, Gato, Vaca, Cavalo
}

fun x(p: Prioridade){

}

fun main(){
    for(p in Prioridade.values()){
        println(p)
    }


}