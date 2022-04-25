class Receita{
    // lateinit precisa que a variavel seja var
    // a variavel so é salva na memoria depois qe a mesma for inicializada
    lateinit var instrucoes: String

    fun geraReceita(){
        instrucoes = "Lave as maos"
    }

    fun ImprimeReceita(){
        if(this::instrucoes.isInitialized){
            instrucoes = "Lave as maos"
        }
    }

}

fun main(){
    var r : Receita = Receita()
    r.geraReceita()

    println(r.instrucoes)
},