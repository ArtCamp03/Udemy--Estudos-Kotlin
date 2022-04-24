fun main(){
    val p = Pessoa(1995, "Frank")

    p.acordar()
    p.dormir()

    with(p) {
        acordar()
        dormir()
    }
}