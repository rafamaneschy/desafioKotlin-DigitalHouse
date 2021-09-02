package entities

import java.time.LocalDate

class Matricula(
    aluno: Aluno,
    curso: Curso,
    val dataDeMatricula: LocalDate = LocalDate.now()
) {

}