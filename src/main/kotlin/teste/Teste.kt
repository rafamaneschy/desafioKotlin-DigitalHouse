package teste

import entities.Aluno
import entities.ProfessorAdjunto
import entities.ProfessorTitular

class Curso(val codigo: Int) {

    constructor(codigo: Int, nome: String, qtdMaximaDeAlunos: Int,) : this(codigo)

    constructor(
        codigo: Int, nome: String, qtdMaximaDeAlunos: Int,
        professorTitular: ProfessorTitular, professorAdjunto: ProfessorAdjunto
    ) : this(codigo, nome,qtdMaximaDeAlunos)

    var nome:String? = null
    val qtdMaximaDeAlunos:Int = 0
    var listaDeAlunosDoCurso = mutableListOf<Aluno>()

fun main() {
    var qtdMaximaDeAlunos: Int = 3
    var listaDeAlunosDoCurso = mutableListOf<Int>(1,3)

    fun adicionarUmAluno():Boolean {
        var cont = 0
        for (alunos in listaDeAlunosDoCurso) cont++
        return cont<qtdMaximaDeAlunos
    }

}
}