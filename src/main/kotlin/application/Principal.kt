package application

import entities.*

fun main() {

    //Criando a escola Digital House
    val escolaDigitalHouse = DigitalHouseManager("21.212.212/2121-21","São Paulo")

    println(escolaDigitalHouse)
    println()

    //Registrar 2 Professores Titular
    println("...............Registrando professores")

    var romario = escolaDigitalHouse.registrarProfessorTitular(52,"Romário","Ferreira",
        5,"Android")

    var jose = escolaDigitalHouse.registrarProfessorTitular(53,"José","Rebelo",
        4,"Android")
        println()
    println("================ Professores Digital House=====================")
    println(escolaDigitalHouse.professoresDigitalHouse)
        println()
    println("...............Registrando professores")

    //Registrar 2 Professores Adjuntos
    var jonatas =  escolaDigitalHouse.registrarProfessorAdjunto(54,"Jônatas","Araujo",
        3,80)
    var carlos = escolaDigitalHouse.registrarProfessorAdjunto(55,"Carlos","Silva",
        2,80)
        println()
    println("================ Professores Digital House=====================")
    println(escolaDigitalHouse.professoresDigitalHouse)
        println()
    println("...............Registrando cursos")

    //Registrar 2 Cursos
    var cursoFullStack =  escolaDigitalHouse.registrarCurso(20001,"Full Stack",5)

    var cursoAndroid = escolaDigitalHouse.registrarCurso(20002,"Android",5)
        println()
    println("================ Cursos Digital House=====================")
    println(escolaDigitalHouse.cursosDigitalHouse)
    println()

    //Alocar Professores no curso - Fail
    escolaDigitalHouse.alocarProfessor(20001,53,55)
    escolaDigitalHouse.alocarProfessor(20002,52,54)
    println("//////////  Minha Alocação Falhou :(  /////////////")
    println()

    //Registrando Alunos
    println("...............Registrando Alunos")
    escolaDigitalHouse.registrarAluno(100,"Ricardo","Souza")
    escolaDigitalHouse.registrarAluno(101,"Rodrigo","Paes")
    escolaDigitalHouse.registrarAluno(102,"Hugo","Silva")
    escolaDigitalHouse.registrarAluno(103,"Rafael","Maneschy")
    escolaDigitalHouse.registrarAluno(104,"Bruno","Martins")
        println()
    println("================ Alunos Registrados =====================")
    println(escolaDigitalHouse.alunosDigitalHouse)
    println()

    println("...............Matriculando Alunos - Curso Full Stack")
    escolaDigitalHouse.matricularAluno(100,20001)
    escolaDigitalHouse.matricularAluno(101,20001)
    println()
    println("...............Matriculando Alunos - Curso Android")
    escolaDigitalHouse.matricularAluno(102,20002)
    escolaDigitalHouse.matricularAluno(103,20002)

    println()
    println("================ Alunos Matriculados =====================")
    println(escolaDigitalHouse.matriculasDigitalHouse)
}
