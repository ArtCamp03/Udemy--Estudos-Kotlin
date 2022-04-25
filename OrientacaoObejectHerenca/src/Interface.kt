// interface e um contrato que define os metodos
// quem assina o contrato tem qe instanciar
// classe abstrata vc herda, interface vc implementa
interface Selvagem {
    fun atacar()

    // uma variavel dentro da interface pode ser definida porem nao pode atribuir valor
    //Porque a interface nao mantem estados, diferente da classe abstrata
    val teste : String
}

// nao existe herança multipla no kotlin
// mas uma classe pode chamar varias interfaces
abstract class Mamifero(val nome:string){
    fun acordar(){
        println("Acordei ...")
    }

    fun dormir() {
        println("Dormi ...")
    }

    abstract fun falar(){}
    abstract fun comer()

}

class Cachorro(nome:String): Mamifero(nome), Selvagem{
    override fun falar() {
        TODO("Not yet implemented")
    }

    override fun comer() {
        TODO("Not yet implemented")
    }

    override fun atacar() {
        TODO("Not yet implemented")
    }



}

fun main() {

}