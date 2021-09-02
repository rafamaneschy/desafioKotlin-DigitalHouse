package entities

class Aluno(
    val codigo: Int,
    var nome: String,
    var sobrenome: String)
{
    override fun equals(other: Any?): Boolean {
        return (other is Aluno && other.codigo == this.codigo)
    }

    override fun hashCode(): Int {
        return this.codigo
    }

    override fun toString(): String {
        return "Aluno: $nome $sobrenome"
    }

}