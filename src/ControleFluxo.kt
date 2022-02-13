fun saudacao(boa:Boolean):String{
    return if(boa){
        "Bom dia"
    }else{
        "Mal dia"
    }
}
/*
fun saudacao(boa:Boolean) = if(boa){
        "Bom dia"
    }else{
        "Mal dia"
    }
 */


fun main(){
    println(saudacao(true))

}