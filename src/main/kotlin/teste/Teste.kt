package teste



class CursoTeste(val codigo: Int, var nome: String, var qtdMaximaDeAlunos: Int,){

}



fun main() {
    var qtdMaximaDeAlunos: Int = 3
    var listaDeAlunosDoCurso = mutableListOf<Int>(1,3)

    fun adicionarUmAluno():Boolean {
        var cont = 0
        for (alunos in listaDeAlunosDoCurso) cont++
        return cont<qtdMaximaDeAlunos
    }

    println(adicionarUmAluno())
}