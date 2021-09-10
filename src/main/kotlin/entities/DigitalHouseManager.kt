package entities

class DigitalHouseManager(val cnpj:String,val cidade:String) {

    var cursosDigitalHouse: MutableList<Curso> = mutableListOf<Curso>()
    var professoresDigitalHouse: MutableList<Professor> = mutableListOf<Professor>()
    var alunosDigitalHouse: MutableList<Aluno> = mutableListOf<Aluno>()
    var matriculasDigitalHouse: MutableList<Matricula> = mutableListOf<Matricula>()


    //************** FUNÇÕES REFERENTE AOS CURSOS DA ESCOLA *******************//

    //Função usada para encontrar um Curso através do seu índice na lista
    fun encontrarCurso(codigoCurso: Int):Int {
        var indiceCurso = -1
        for (codigoCurso in cursosDigitalHouse) indiceCurso++
        return indiceCurso
    }

    //Função usada para registrar um Curso na escola
    fun registrarCurso(codigo: Int, nome: String, qtdMaximaDeAlunos: Int) {
        try {
            var curso = Curso(codigo, nome, qtdMaximaDeAlunos)
            cursosDigitalHouse.add(curso)
            println("Curso ** $nome ** Registrado com sucesso!!")
        } catch (ex: Exception) { println ("Erro registrar curso")}
    }

    //Função usada para excluir um Curso na escola
    fun excluirCurso(codigo: Int) {
        try {
            var cont = -1
            for (codigo in cursosDigitalHouse) cont++
            cursosDigitalHouse.removeAt(cont)
            println("Curso excluído com sucesso!!")
        } catch (ex: Exception) { println ("Erro excluir curso")}
    }


    //************** FUNÇÕES REFERENTE AOS PROFESSORES DA ESCOLA *******************//

    //Função usada para encontrar um Professor através do seu índice na lista
    fun encontrarProfessor(codigoProfessor:Int):Int{
        var indiceProfessor = -1
        for (codigoProfessor in professoresDigitalHouse) indiceProfessor++
        return indiceProfessor
    }

    fun registrarProfessorAdjunto(codigo: Int,nome: String,sobrenome: String,tempoDeCasa: Int,horasDeMonitoria: Int) {
        try {
            var professorAdjunto = ProfessorAdjunto(codigo, nome, sobrenome, tempoDeCasa, horasDeMonitoria)
            this.professoresDigitalHouse.add(professorAdjunto)
            println("Professor Adjunto ** $nome $sobrenome ** registrado com sucesso!!")
        } catch (ex: Exception) { println ("Erro registrar prof.Adjunto")}
    }


    fun registrarProfessorTitular(codigo: Int,nome: String,sobrenome: String,tempoDeCasa: Int,especialidade: String) {
        try {
            var professorTitular = ProfessorTitular(codigo, nome, sobrenome, tempoDeCasa, especialidade)
            this.professoresDigitalHouse.add(professorTitular)
            println("Professor Titular ** $nome $sobrenome ** registrado com sucesso!!")
        } catch (ex: Exception) { println ("Erro registrar prof.Titular")}
    }

    fun excluirProfessor(codigo: Int) {
        try {
            var cont = -1
            for (codigo in professoresDigitalHouse) cont++
            professoresDigitalHouse.removeAt(cont)
            println("Professor excluído com sucesso!!")
        } catch (ex: Exception) { println ("Erro excluir professor")}
    }


    fun alocarProfessor(codigoCurso: Int, codigoTitular: Int, codigoAdjunto: Int){
        var professorTitular = professoresDigitalHouse[encontrarProfessor(codigoTitular)]
        var professorAdjunto = professoresDigitalHouse[encontrarProfessor(codigoAdjunto)]
        var curso = cursosDigitalHouse[encontrarCurso(codigoCurso)]

        try {
            curso.professorTitular = professorTitular as ProfessorTitular
            curso.professorAdjunto = professorAdjunto as ProfessorAdjunto
            println("Professor alocado com sucesso!!")
        } catch (ex: Exception) { println ("Erro alocar professor")}


    }


    //************** FUNÇÕES REFERENTE AOS ALUNOS DA ESCOLA *******************//

    fun encontrarAluno(codigoAluno: Int): Int {
        var indiceAluno = -1
        for (codigoAluno in alunosDigitalHouse) indiceAluno++
        return indiceAluno
    }

    fun registrarAluno(codigo: Int, nome: String, sobrenome: String) {
        try {
            var aluno = Aluno(codigo, nome, sobrenome)
            alunosDigitalHouse.add(aluno)
            println("Aluno ** $nome $sobrenome ** registrado com sucesso!!")
        } catch (ex: Exception) { println ("Erro registrar Aluno")}
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        var aluno = alunosDigitalHouse[encontrarAluno(codigoAluno)]
        var curso = cursosDigitalHouse[encontrarCurso(codigoCurso)]

        if (curso.adicionarUmAluno(aluno)){
            var matricula = Matricula(aluno,curso)
            matriculasDigitalHouse.add(matricula)
            println("Matrícula realizada")
        }else println("Não ha vagas nesse curso")
    }


    override fun toString(): String {
        return "================== ESCOLA DIGITAL HOUSE - cnpj $cnpj - $cidade =================="
    }

}