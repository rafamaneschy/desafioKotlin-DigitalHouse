package entities

class Aluno(val codigo: Int){

    var nome:String?=null
    var sobrenome:String?=null

    constructor(codigo: Int, nome: String, sobrenome: String):this(codigo){
        this.nome = nome
        this.sobrenome = sobrenome
    }

    override fun equals(other: Any?): Boolean {
        return (other is Aluno && other.codigo == this.codigo)
    }

    override fun hashCode(): Int {
        return this.codigo
    }

    override fun toString(): String {
        return "Aluno: cod.$codigo $nome $sobrenome"
    }

}