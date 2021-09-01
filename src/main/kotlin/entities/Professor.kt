package entities

open class Professor(
    val id: Int,
    var nome: String,
    var sobrenome: String,
    val tempoDeCasa:Int)
{
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Professor

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }

    override fun toString(): String {
        return "Professor: $nome $sobrenome"
    }


}