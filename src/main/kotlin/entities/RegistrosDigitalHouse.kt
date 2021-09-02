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
    fun alocarProfessores(){

    }


    //Funções referente aos alunos
    fun RegistrarAluno(codigo: Int, nome: String, sobrenome: String){


    }
    fun MatricularAluno(codigoAluno: Int,codigoCurso: Int){

    }

}