fun main() {
    val pessoaMari = Pessoa()
    pessoaMari.nome = "Mari"
    println(pessoaMari.nome)
    println(pessoaMari.nascimento)
    println(pessoaMari.idade)
}
class Pessoa {
    var nome: String = ""
    var nascimento: Int = 2002
    var idade: Int = 2022 - nascimento
    get() {
        return field
    }
    set(value) {
        field = value
    }
}


