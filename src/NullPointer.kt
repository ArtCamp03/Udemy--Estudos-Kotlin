fun main(){
    // nao deixa atribuir variavel nula
    // por padrao o Kotlin trabalha com variaveis nao nulas

    // jeito errado
    //var str : String = null

    // jeito certo a linguagem Kotlin trata caso ocorra algum problema
    var str2 : String? = null
    // tamanho da variavel qe pode ser nula
    println(str2?.length)

    // jeito certo o programador trata essa excesssao caso ocorra algum problema
    println(str2!!.length)
}