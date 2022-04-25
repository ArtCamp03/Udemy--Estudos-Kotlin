// Polimorfismo -> assume varias formas
// classe pai ou classe mae, todo gerente e um funcionario
interface Funcionario{
    var salario: Float
    fun bonus(): Float
}

class Gerente(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario + 0.5f
    }
}

class Analista(override var salario: Float) : Funcionario{
    override fun bonus(): Float {
        return salario + 0.3f
    }
}

fun mostraBonus(g: Funcionario){
    println(g.bonus())
}

fun mostraBonus(a: Funcionario){
    println(a.bonus())
}

fun main(){

    mostraBonus(Gerente(5000f))
    mostraBonus(Analista(2000f))
}