fun main() {
    val pessoaMari = Pessoa()
    println(pessoaMari.nome)
    pessoaMari.nome = "Celle"
    println(pessoaMari.nome)

}

class Pessoa {
    var nome: String = "Mari"
    get() {
        return field
    }
    set(value) {
        field = value
    }
}
