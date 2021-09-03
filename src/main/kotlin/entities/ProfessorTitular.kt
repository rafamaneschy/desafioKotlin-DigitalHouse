package entities

class ProfessorTitular(codigo: Int,nome: String,sobrenome: String, var especialidade:String,
                       tempoDeCasa: Int) : Professor(codigo, nome, sobrenome, tempoDeCasa) {


}