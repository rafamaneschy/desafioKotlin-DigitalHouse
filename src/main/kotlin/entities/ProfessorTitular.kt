package entities

class ProfessorTitular(codigo: Int,nome: String,sobrenome: String, tempoDeCasa: Int,
                       var especialidade:String) : Professor(codigo, nome, sobrenome, tempoDeCasa) {

}