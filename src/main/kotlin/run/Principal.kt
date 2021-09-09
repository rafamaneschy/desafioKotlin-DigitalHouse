package run

import entities.*

class Principal {


}

fun main() {

    val escolaDigitalHouse = DigitalHouseManager("21.212.212/2121-21","São Paulo")

    escolaDigitalHouse.registrarProfessorTitular(12,"Roberto","Carlos",
                                                 "Full Stack",5)

    escolaDigitalHouse.registrarProfessorTitular(13,"José","Araújo",
                                                  "Android",6)

    println(escolaDigitalHouse.professoresDigitalHouse)

    escolaDigitalHouse.registrarCurso(20001,"Full Stack",3)
    escolaDigitalHouse.registrarCurso(20002,"Android",2)


    println(escolaDigitalHouse.cursosDigitalHouse)

    escolaDigitalHouse.registrarAluno(20014,"Felipe", "Santos")
    escolaDigitalHouse.registrarAluno(20015,"Leonardo", "Pina")

    println(escolaDigitalHouse.alunosDigitalHouse)

    escolaDigitalHouse.excluirProfessor(13)

    println(escolaDigitalHouse.professoresDigitalHouse)

    escolaDigitalHouse.matricularAluno(20014,20002)

    println(escolaDigitalHouse.matriculasDigitalHouse)

}
