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
        if (this.cursosDigitalHouse.contains(Curso(codigo))) {
            this.cursosDigitalHouse.remove(Curso(codigo))
        } else "Esse Curso não está na lista"

    }

    override fun registrarProfessorAdjunto(horasDeMonitoria:String, codigo: Int, nome: String,
                                           sobrenome: String,tempoDeCasa: Int) {
        var professorAdjunto = ProfessorAdjunto(horasDeMonitoria,codigo,nome,sobrenome,tempoDeCasa)
        this.professoresDigitalHouse.add(professorAdjunto)
    }

    fun registrarProfessorTitular(codigo: Int, nome: String,sobrenome: String,
                                           especialidade: String, tempoDeCasa: Int,) {
        var professorTitular = ProfessorTitular(codigo,nome,sobrenome,especialidade,tempoDeCasa)
        this.professoresDigitalHouse.add(professorTitular)
    }

    override fun excluirProfessor(codigo: Int) {
        if (this.professoresDigitalHouse.contains(Professor(codigo))) {
            this.professoresDigitalHouse.remove(Professor(codigo))
        } else "Esse Professor não está na lista"
    }

    // TODO: 02/09/2021
    override fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        this.professoresDigitalHouse.contains(Professor(codigoProfessorTitular))
        this.professoresDigitalHouse.contains(Professor(codigoProfessorAdjunto))
        this.cursosDigitalHouse.contains(Curso(codigoCurso))

    }

    override fun registrarAluno(codigo: Int, nome: String, sobrenome: String) {
        var aluno = Aluno(codigo,nome,sobrenome)
        this.alunosDigitalHouse.add(aluno)
    }

    override fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        if ( this.alunosDigitalHouse.contains(Aluno(codigoAluno)) &&
             this.cursosDigitalHouse.contains(Curso(codigoCurso)) &&
             Curso(codigoCurso).adicionarUmAluno(Aluno(codigoAluno)) )
        {
              var matricula = Matricula(Aluno(codigoAluno), Curso(codigoCurso))
                this.matriculasDigitalHouse.add(matricula)
                println("Matrícula Realizada")


        } else {
            "Sua matrícula não pode ser realizada"
        }
    }

}


