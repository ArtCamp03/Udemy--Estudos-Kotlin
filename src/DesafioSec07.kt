/*
    Ana e Paula sao duas programadoras da empresa XDM . Aempresa XDM possui um beneficio para incentivar os funcionarios
    a pouparem dinehiro para a aposentadoria que funciona da seguinte maneira:
    Se o funcionario destinar 5% do seu salario para o investimento, a empresa acrescenta o mesmo valor
    . Ou seja seja caso o funcionario invista 100 reais , a empresa investe mais 100.
    Este fundo de investimento possui rendimento de 0,2 % ao mes.

    Ana adorou a ideia e vai investir. No entanto Paula decidiu que vai investir os mesmos 5%
    por conta propria ja que conhece investimentos que rendem mais que 0,2% ao mes. Paula vai escolher investimentos qe rendem 0,8 % ao mes
    , considere o salario de Ana e Paula iguais e no valor de 10 mil reais e que as duas estao começando com saldo 0 e que investirao 5% do salario.

    En quantos meses o Patrimonio de Paula vai superar o patrimonio de Ana?

 */

fun main(){
    CalculaInvestimento()
}

fun CalculaInvestimento(){
    var salario = 10000f
    var patrPaula = 0f
    var patrAna = 0f
    var mes = 0

    do{
        patrAna += (salario * 0.05f) + (salario * 0.05f) + (patrAna * 0.002f)
        patrPaula += (salario * 0.05f) + (patrPaula * 0.008f)
        mes++
        println("Patrimonio Ana $patrAna ------------  Patrimonio Paula $patrPaula")

    }while(patrAna > patrPaula)
    println("Ana : ${(patrAna * 0.002f)}")
    println("Paula : ${(patrPaula * 0.008f)}")
    print("Paula passaa o patrimonio de Ana no mes: $mes")
}