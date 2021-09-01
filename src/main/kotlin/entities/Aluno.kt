package entities

class Aluno(
    val id: Int,
    var nome: String,
    var sobrenome: String)
{
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Aluno

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }

    override fun toString(): String {
        return "Aluno: $nome $sobrenome"
    }

}