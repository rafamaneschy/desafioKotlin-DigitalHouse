package entities

import java.time.LocalDate

class Matricula(aluno: Aluno, curso: Curso) {

    constructor(aluno: Aluno, curso: Curso, dataDeMatricula: LocalDate = LocalDate.now()): this(aluno, curso)

init {

    var dataDeMatricula = LocalDate.now();
}

}


