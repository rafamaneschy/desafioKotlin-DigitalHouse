package entities

open class Professor(val codigo: Int) {

    constructor(codigo: Int, nome: String,sobrenome: String,tempoDeCasa: Int):this(codigo)

    var nome:String?=null
    var sobrenome:String?=null
    var tempoDeCasa: Int = 0


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