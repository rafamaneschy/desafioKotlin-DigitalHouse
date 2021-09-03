package entities


interface RegistrosDigitalHouse {

    // Funções referente aos Cursos
    fun registrarCurso(codigo:Int, nome:String,qtdMaximaDeAlunos:Int){

    }
    fun excluirCurso(codigo:Int){

    }


    //Funções referente aos professores
    fun registrarProfessorAdjunto(horasDeMonitoria:String, codigo: Int, nome: String, sobrenome: String,
                                  tempoDeCasa: Int){

    }
    fun registrarProfessorTitular(especialidade:String,codigo: Int,nome: String,sobrenome: String,
                                  tempoDeCasa: Int){

    }

    fun excluirProfessor(codigo: Int){

    }
    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){

    }


    //Funções referente aos alunos
    fun registrarAluno(codigo: Int, nome: String, sobrenome: String){


    }
    fun matricularAluno(codigoAluno: Int,codigoCurso: Int){

    }

}