package entities

open class Professor(val codigo: Int,var nome: String, var sobrenome: String,var tempoDeCasa: Int=0) {


    override fun equals(other: Any?): Boolean {
        return (other is Professor && other.codigo == this.codigo)
    }

    override fun hashCode(): Int {
        return this.codigo
    }

    override fun toString(): String {
        return "Professor: $nome $sobrenome"
    }

}