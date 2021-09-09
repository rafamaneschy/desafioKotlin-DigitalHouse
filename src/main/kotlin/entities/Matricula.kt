package entities

import java.time.LocalDate

class Matricula(var aluno: Aluno, var curso: Curso){

    var dataDeMatricula = LocalDate.now()


    override fun toString(): String {
        return "$aluno | $curso"
    }


}


