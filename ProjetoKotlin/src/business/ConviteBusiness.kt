package business

class ConviteBusiness {
    fun validaTipo(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    fun codigoVAlido(codigo:String, tipo: String): Boolean{
        return if (tipo == "comum" && codigo.startsWith("xt")) {
            return true
        } else if ((tipo == "premium" || tipo == "luxo") && codigo.startsWith("xl")) {
            return true
        } else {
            return false
        }
    }
}