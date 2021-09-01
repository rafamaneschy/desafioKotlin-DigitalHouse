package entities

class ProfessorAdjunto(
    var horasDeMonitoria:String,
    id: Int,
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int) : Professor(id, nome, sobrenome, tempoDeCasa) {

}