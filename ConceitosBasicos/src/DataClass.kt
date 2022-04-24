fun main(){
    val f1: Forma = Forma(23,10)
    val f2: Forma = Forma(23,10)

    val f3: FormaDate = FormaDate(15,30)
    val f4: FormaDate = FormaDate(15,30)

    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())
    println("------------------")
    println(f2.toString())
    println(f2.hashCode())

    println(f3.equals(f2))
    println(f3.toString())
    println(f3.hashCode())
    println("------------------")
    println(f4.toString())
    println(f4.hashCode())

}

// Data class ja faz por padrao
class Forma(val a: Int, val b : Int){
    override fun equals(orther:Any?): Boolean {
        return if(orther is Forma){
            (orther.a == this.a && orther.b == b)
        }else{
             false
        }
    }
}

data class FormaDate(val a: Int, val b : Int){}

// Exemplo de uso data class
data class Endereco(val rua: String, val numero:Int, val bairro: String)

fun endereco(e: Endereco){}