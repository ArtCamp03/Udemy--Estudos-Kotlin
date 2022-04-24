fun main(){
    val p = Pessoa(1995, "Frank")

    p.acordar()
    p.dormir()

    // with eh uma funçao qe utiliza varios metodos de uma ves
    with(p) {
        acordar()
        dormir()
    }
}