package entities

class Curso(val codigo: Int) {

    constructor(codigo: Int, nome: String, qtdMaximaDeAlunos: Int,) : this(codigo){
        this.nome = nome
        this.qtdMaximaDeAlunos = qtdMaximaDeAlunos
    }

    constructor(codigo: Int, nome: String, qtdMaximaDeAlunos: Int,professorTitular: ProfessorTitular,
                professorAdjunto: ProfessorAdjunto) : this(codigo, nome,qtdMaximaDeAlunos){

                }

    var nome:String? = ""
    var qtdMaximaDeAlunos:Int = 0
    var listaDeAlunosMatriculados = mutableListOf<Aluno>()


   fun adicionarUmAluno(aluno: Aluno):Boolean {
      return listaDeAlunosMatriculados.size < qtdMaximaDeAlunos

    }

    fun excluirAluno(aluno: Aluno){
        if (listaDeAlunosMatriculados.contains(aluno)) listaDeAlunosMatriculados.remove(aluno)
        else println("Aluno não está no curso")
    }

    override fun equals(other: Any?): Boolean {
        return (other is Curso && other.codigo == this.codigo)
    }

    override fun hashCode(): Int {
        return this.codigo
    }

    override fun toString(): String {
        return "Curso: cod.$codigo ${this.nome}"
    }


}


