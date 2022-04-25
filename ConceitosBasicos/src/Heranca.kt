//* Herança
//* modificadores de visibilidade
//* private pode ser usado no metodo , variavel ou na classe
// modificadores public , protected

private class X() //limita a classe somente a o arquyivo em que ela esta

open class Eletronico(var marca: String){
    //metodo visto pela classe e pela classe que herda
    protected fun ativarCorrente() {}

    // metodo visto apenas pela classe
    private fun ligar() {
        ativarCorrente()
        println("Computador Ligado ..")
    }
    fun desligar() {
        println("Computador desligando ..")
    }

}

class Computador(marca: String): Eletronico(marca){
    fun instalarSoftware() {}
    fun processar() {}
}

fun main(){
    var c: Computador = Computador("DELL")

    println(c.ligar())
}