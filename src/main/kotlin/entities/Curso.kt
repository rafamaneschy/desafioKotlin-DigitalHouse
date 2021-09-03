package entities

class Curso(val codigo: Int) {

    var nome:String? = null
    var qtdMaximaDeAlunos:Int = 0

    constructor(codigo: Int, nome: String, qtdMaximaDeAlunos: Int,) : this(codigo){
        this.nome = nome
        this.qtdMaximaDeAlunos = qtdMaximaDeAlunos
    }

    constructor(codigo: Int, nome: String, qtdMaximaDeAlunos: Int,professorTitular: ProfessorTitular,
                professorAdjunto: ProfessorAdjunto) : this(codigo, nome,qtdMaximaDeAlunos){

                }


    var listaDeAlunosMatriculados = mutableListOf<Aluno>()


   fun adicionarUmAluno(aluno: Aluno):Boolean {
        var cont = 0
        for (alunos in listaDeAlunosMatriculados) cont++
        return cont<qtdMaximaDeAlunos
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
        return "Curso: cod.$codigo $nome"
    }


}


