package entities

class ProfessorTitular(
    var especialidade:String,
    id: Int,
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int) : Professor(id, nome, sobrenome, tempoDeCasa) {


}