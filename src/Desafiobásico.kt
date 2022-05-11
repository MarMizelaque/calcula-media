import kotlin.system.exitProcess

fun main()
{
    var repetir =false
    do {
        println("informe a primeira nota")
        val n1 = readln().toDouble()
        println("informe a segunda nota")
        val n2= readln().toDouble()
        println("informe a terceira nota")
        val n3=readln().toDouble()
        println("informe a quarta nota")
        val n4= readln().toDouble()
        val media =(n1+n2+n3+n4)/4.0
        print("sua média é ")
        println(media)
        print("calcular nota: sim -1 não -2")
        val opcaoUsuario: Int = readln().toInt()
        if (opcaoUsuario == 1)
        {
            repetir=true
        }
        else if (opcaoUsuario == 2)
        {
            repetir=false

        }
        else
        {
            repetir=false
            println("opçaõ invalida")
               }
    }
    while (repetir)
    exitProcess(0)
}