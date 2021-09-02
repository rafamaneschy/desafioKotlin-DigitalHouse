package entities

class DigitalHouseManager(val cnpj:String,val cidade:String):RegistrosDigitalHouse {

    var cursosDigitalHouse = mutableListOf<Curso>()
    var professoresDigitalHouse = mutableListOf<Professor>()
    var alunosDigitalHouse = mutableListOf<Aluno>()
    var matriculasDigitalHouse = mutableListOf<Matricula>()

    override fun registrarCurso(codigo:Int, nome:String,qtdMaximaDeAlunos:Int) {
        var curso = Curso(codigo,nome,qtdMaximaDeAlunos)
        this.cursosDigitalHouse.add(curso)
    }

    override fun excluirCurso(codigo: Int) {
        cursosDigitalHouse.forEach(){ it.codigo == codigo }
        

    }
//    cursosDigitalHouse.filter{ it.codigo == codigo }

}