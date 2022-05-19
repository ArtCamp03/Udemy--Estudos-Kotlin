interface EventListener{
    fun click()
}

class Form{
    // classe anonima
    fun clickJava(e: EventListenerJava) {}
    // funçao anonima
    fun clickKotlin(e: EventListener) {}
}

class Main{

    fun main(){

        // SAM conversion - Single Abstract Method
        Form().clickJava(object : EventListenerJava {
            override fun click() {
            }
        })

        Form().clickKotlin(object : EventListener {
            override fun click() {

            }
        })

    }

}

// Classe anonima e diferente de funçao anonima
// classe anonima nao tem acesso ao escopo da classe onde esta inserida
// ja a funçao anonima tem acesso a variavel doe scopo