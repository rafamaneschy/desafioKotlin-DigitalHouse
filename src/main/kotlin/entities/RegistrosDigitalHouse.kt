package entities


interface RegistrosDigitalHouse {

    // Funções referente aos Cursos
    fun registrarCurso(codigo:Int, nome:String,qtdMaximaDeAlunos:Int){

    }
    fun excluirCurso(codigo:Int){

    }


    //Funções referente aos professores
    fun registrarProfessorAdjunto(){

    }
    fun registrarProfessorTitular(){

    }

    fun excluirProfessor(){

    }
    fun alocarProfessores(){

    }


    //Funções referente aos alunos
    fun RegistrarAluno(){


    }
    fun MatricularAluno(){

    }

}