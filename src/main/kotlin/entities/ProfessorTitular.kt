package entities

class ProfessorTitular(
    var especialidade:String,
    codigo: Int,
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int) : Professor(codigo, nome, sobrenome, tempoDeCasa) {


}