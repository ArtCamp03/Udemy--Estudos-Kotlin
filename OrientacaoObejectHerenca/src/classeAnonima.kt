interface Event(){
    fun onSucess()
}

class Programa {
    fun Salvar(e: Event){
        println("Abrindo conexoes ...")
        println("Salvando valores ...")
        println("Sucesso. Conexoes fechadas. ...")
        e.onSucess()
    }

}

// possivel soluçao para o problema


fun main(){
    val p = Programa()
    val e = Evento()
    p.Salvar(object : Event {
        override fun onSucess() {
            println("onSucess !!")
        }

    })


}