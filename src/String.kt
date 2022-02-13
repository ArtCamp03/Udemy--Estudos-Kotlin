fun Main(){

    // funçoes de strings

    val str = "Tudo esta ok, aki"

    println("Tamanho da string: ${str.length}")
    println("Posicao (index) 0 da string: ${str[0]}")
    println(str.startsWith("Tud"))
    println(str.endsWith("abc"))
    println(str.substring(2, 8))
    println(str.replace("esta", "bem"))
    println(str.lowercase())
    println(str.uppercase())

    val stri = "Tudo esta        ok,     aki.  Meu   nome            eh"
    println(stri.trim())
    println()
}