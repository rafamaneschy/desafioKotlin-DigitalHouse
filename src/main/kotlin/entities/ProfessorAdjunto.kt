package entities

class ProfessorAdjunto( codigo: Int, nome: String, sobrenome: String,
                        tempoDeCasa: Int, var horasDeMonitoria:Int,)
    : Professor(codigo, nome, sobrenome, tempoDeCasa) {


}