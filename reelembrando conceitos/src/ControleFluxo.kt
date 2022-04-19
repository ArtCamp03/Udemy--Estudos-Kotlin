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

// exercicios

/*
Exec 1
    Escreva um programa para ajudar a empresa XPTO calcular o bonus que os funcionarios receberam no fim do ano . Os bonus
    sao classificados por cargo
    a. Gerentes recebem R$ 2.000,00
    b. Coordenadores recebem R$ 1.500,00
    c. Engenheiros de software recebem R$ 1.000,00
    d. Estagiarios recebem R$ 500,00
Exec 2
    Modifique o primeiro exercicio para considerrar o tempo de experiencia
    no calculo de Bonus

    a. Gerentes com menos de 2 anos de experiencia recebem R$ 2.000,00 , caso contrario recebem R$ 3.000,00
    b. Coordenadores com menos de 1 ano de experiencia recebem R$ 1.500,00, caso contrario recebem R$ 1.800,00
    c. Engenheiros de software recebem R$ 1.000,00
    d.  Estagiarios recebem R$ 500,00

 */

fun bonus(cargo:String):Float{
    var bonus = 0f
    if(cargo == "Gerente"){
        bonus = 2000f
    }else if(cargo == "Coordenador"){
        bonus = 1500f
    }else if(cargo == "Engenherio"){
        bonus = 1000f
    }else if(cargo == "Estagiario"){
        bonus = 500f
    }
    return bonus
}

fun bonusXP(cargo:String, xp:Int):Float{
    var bonus = 0f
    if(cargo == "Gerente"){
        if(xp < 2){
            bonus = 2000f
        }else{
            bonus = 3000f
        }

    }else if(cargo == "Coordenador"){
        if(xp < 1){
            bonus = 1500f
        }else{
            bonus = 1800f
        }

    }else if(cargo == "Engenherio"){
        bonus = 1000f
    }else if(cargo == "Estagiario"){
        bonus = 500f
    }
    return bonus
}

// funçao when
fun bonusWhen(cargo:String):Float{
    var bonus = 0f
    when(cargo){
        "Gerente" -> {
            bonus = 2000f
        }
        // ou
        "Coordenador" -> bonus = 1500f
    }
    return bonus
}

fun main(){
    println(saudacao(true))
    println(bonus("Gerente"))
    print(bonusXP("Coordenador",5))
    bonusWhen("Gerente")
}