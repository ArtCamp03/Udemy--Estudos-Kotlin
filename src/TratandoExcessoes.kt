fun main(){
    // jeito certo o programador trata essa excesssao caso ocorra algum problema
   var str:String? = null

    // tratamento Try catch
    try {
       // println(str!!.length)
        // outra excessao
        val a = 10/0
    }catch (e:NullPointerException){
        println("variavel Nula")
    }catch (e:ArithmeticException){
        println("Erro divisao por 0")
    }catch (e:Exception){   // Excessao mais generica
        println("Algum erro encontrado")
    } finally {
        println("Finally")
    }

    println("Fim!! ")
}