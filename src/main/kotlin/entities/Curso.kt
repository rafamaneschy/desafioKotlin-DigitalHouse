package entities

class Curso(
    val id: Int,
    var nome: String,
    )
{
    constructor(id: Int,nome: String, professorAdjunto: ProfessorAdjunto,
                professorTitular: ProfessorTitular) : this(id, nome)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }

    override fun toString(): String {
        return "$nome"
    }


}