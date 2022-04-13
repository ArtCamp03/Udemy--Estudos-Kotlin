fun main(){
    // Elvis Operator
    val str:String? = null

    if(str == null) {
        println("Variavel nula")
    }else{
        println(str)
    }

    // Exemplo de Elvis Operator
    // somente a sintaxe eh diferente
    println(str ?: "null")
    
}