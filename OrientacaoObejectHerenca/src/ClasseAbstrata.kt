// classe  abstrata nao pode ter o open, pois ela nao foi criada para nascer
// porque uma classe abstrata nunca pode ser instanciada eh apenas um molde

abstract class Mamifero(val nome:string){
    fun acordar(){
        println()"Acordei ..."
    }

    fun dormir() {
        println()"Dormi ..."
    }

    abstract fun falar(){}
    abstract fun comer()

}

class Cachorro(nome:String): Mamifero(nome){
    override fun falar() {
        TODO("Not yet implemented")
    }

    override fun comer() {
        TODO("Not yet implemented")
    }

}

fun main() {

}