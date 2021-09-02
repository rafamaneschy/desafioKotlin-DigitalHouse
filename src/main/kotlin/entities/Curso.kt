package entities

class Curso( val codigo: Int, var nome: String, var qtdMaximaDeAlunos: Int,) {

    constructor(
        codigo: Int, nome: String, qtdMaximaDeAlunos: Int,
        professorTitular: ProfessorTitular, professorAdjunto: ProfessorAdjunto
    ) : this(codigo, nome,qtdMaximaDeAlunos)

   var listaDeAlunosDoCurso = mutableListOf<Aluno>()


    fun adicionarUmAluno(aluno: Aluno):Boolean {
        var cont = 0
        for (alunos in listaDeAlunosDoCurso) cont++
        return cont<qtdMaximaDeAlunos
    }

    fun excluirAluno(aluno: Aluno){
        if (aluno in listaDeAlunosDoCurso) listaDeAlunosDoCurso.remove(aluno)
        else println("Aluno não está no curso")
    }


    override fun equals(other: Any?): Boolean {
        return (other is Curso && other.codigo == this.codigo)
    }

    override fun hashCode(): Int {
        return this.codigo
    }

    override fun toString(): String {
        return "$nome"
    }


}


