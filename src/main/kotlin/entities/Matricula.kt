package entities

import java.time.LocalDate

class Matricula(var aluno: Aluno, var curso: Curso) {

    var dataDeMatricula = LocalDate.now()

    constructor(aluno: Aluno, curso: Curso, dataDeMatricula: LocalDate = LocalDate.now()): this(aluno, curso){
        this.dataDeMatricula = dataDeMatricula
    }


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Matricula

        if (aluno != other.aluno) return false
        if (curso != other.curso) return false

        return true
    }

    override fun hashCode(): Int {
        var result = aluno.hashCode()
        result = 31 * result + curso.hashCode()
        return result
    }

    override fun toString(): String {
        return """
            $aluno foi matriculado com suceso!!
            Curso: $curso
            Data de matrícula: $dataDeMatricula
        """.trimIndent()
    }


}


