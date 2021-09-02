package entities

class Aluno(val codigo: Int){

    constructor(codigo: Int, nome: String, sobrenome: String):this(codigo)

    var nome:String?=null
    var sobrenome:String?=null

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