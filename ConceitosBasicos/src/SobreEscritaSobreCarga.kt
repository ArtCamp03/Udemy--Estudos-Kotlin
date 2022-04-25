open class Eletronico(var marca: String){
    //metodo visto pela classe e pela classe que herda
    private fun corrente(ativo: Boolean) {}

    // metodo visto apenas pela classe
    fun ligar() {
        corrente(true)
    }

    open fun desligar() {
        corrente(false)
    }

}

class Computador(marca: String): Eletronico(marca){
    //Overload  tem a mesma funçao mas elas diferem em numeros e tipo de parametros , ou seja sobrecarga de metodo
    fun save() {}
    fun save(a:String) {}
    fun save(a: Int, b: Float) {}

    // Override sobreescreve uma funçao
    override fun desligar(){
        save()
        //desligar() -> metodo desta classe
        super.desligar() // metodo referente a classe pai ou classe mae
    }

}

fun main(){
    val c: Computador = Computador("DELL")
    c.desligar()
    c.ligar()
}