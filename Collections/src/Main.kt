// Lista, set e map

fun main(){
    // listOf utiliza varag
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(1, 2, 3, false, 5, true)

    // colection
    val list3 : List<Int> = listOf(1, 2, 3, 5)
    val list4 : MutableList<Int> = mutableListOf(45,12,12,25)

    println(list4[1])
    println(list4.size)

    list4.add(20)
    list4.add(25)

    println(list4)

    list4.remove(12)
    list4.removeAt(0)

    println(list2.contains(2))
    list4.clear()
    
    println(list4)
}