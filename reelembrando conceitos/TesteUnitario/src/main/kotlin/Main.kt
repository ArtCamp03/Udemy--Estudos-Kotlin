fun countXO(str: String): Boolean {
    val strLower = str.lowercase()

    var i = 0
    var countX = 0
    var countO = 0
    while (i < strLower.length) {
        if (strLower[i] == 'x') {
            countX++
        } else if (strLower[i] == 'o') {
            countO++
        }
        i++
    }

    return countO == countX && countO != 0
}

fun abc(): Boolean{
    return true
}

// metodo que lança excessao
fun abcd(): Boolean{
    val str: String? = null
    return str!!.length == 0
    // throw NullPointerException()

}

fun main() {
    println(countXO("xxoo"))
    println(countXO("xxooo"))
    println(countXO("aa"))
}