package entities

class Curso(val codigo: Int,var nome: String,var qtdMaximaDeAlunos:Int=0) {


    constructor(codigo: Int,nome: String,qtdMaximaDeAlunos: Int,professorTitular: ProfessorTitular,
                professorAdjunto: ProfessorAdjunto) : this(codigo, nome, qtdMaximaDeAlunos){
        this.professorTitular = professorTitular
        this.professorAdjunto = professorAdjunto

    }

    var professorTitular: ProfessorTitular? = null
    var professorAdjunto: ProfessorAdjunto? = null
    var listaDeAlunosMatriculados:MutableList<Aluno> = mutableListOf<Aluno>()


    fun adicionarUmAluno(aluno: Aluno):Boolean {
        if (listaDeAlunosMatriculados.size < qtdMaximaDeAlunos) {
            try {
                listaDeAlunosMatriculados.add(aluno)
                return  true
            }catch (e: Exception){
                println("Erro adicionar aluno")
                return false
            }
        }else{
            println("Não há mais vagas nesse curso")
            return false
        }
    }

    fun excluirAluno(aluno: Aluno) {
        if (listaDeAlunosMatriculados.contains(aluno)) {
            try {
                listaDeAlunosMatriculados.remove(aluno)
                "Aluno excluído com sucesso"
            } catch (ex: Exception) {
                println("Erro excluir aluno")

            }
        }else{println("Aluno não está matriculado no curso")}
    }

    override fun equals(other: Any?): Boolean {
        return (other is Aluno && other.codigo == this.codigo)
    }

    override fun hashCode(): Int {
        return this.codigo
    }

    override fun toString(): String {
        return "Curso: cod.$codigo $nome"
    }
}

