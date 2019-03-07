import java.util.Scanner
import scala.annotation.switch
import Calculadora._

object Menu {

  def menu(): Unit = {
    println("!!Calculadora Cientifica!!")
    println("01 - Soma \t\t\t02 - Subtracao\n03 - Multiplicacao \t04 - Divisao \n05 - raiz Quadrada \t06 - " +
      "Exponenciacao \n07 - Logaritmo \t\t08 - Seno \n09 - Cosseno \t\t10 - Tangente \n11 - Mod \t\t\t12 - Fatorial" +
      " \n13 - Exponencial de e 14 - Sair do programa")
    println("Escolha sua opcao: ")
    var entrada = new Scanner(System.in)
    var escolha = entrada.nextInt()

    var num = (escolha: @switch) match {
      case 1 =>
        println("Digite o 1 valor:")
        val r1 = entrada.nextFloat()
        println("Digite o 2 valor:")
        var r2 = entrada.nextFloat()
        println()
        println("Resultado:" + soma(r1, r2))
        println()
        menu()
      case 2 =>
        println("Digite o 1 valor:")
        var r1 = entrada.nextFloat()
        println("Digite o 2 valor:")
        var r2 = entrada.nextFloat()
        println()
        println("Resultado:" + subtracao(r1, r2))
        menu()
      case 3 =>
        println("Digite o 1 valor:")
        var r1 = entrada.nextFloat()
        println("Digite o 2 valor:")
        var r2 = entrada.nextFloat()
        println()
        println("Resultado:" + multiplicacao(r1, r2))
        menu()
      case 4 =>
        println("Digite o 1 valor:")
        var r1 = entrada.nextFloat()
        println("Digite o 2 valor:")
        var r2 = entrada.nextFloat()
        println()
        println("Resultado:" + divisao(r1, r2))
        menu()
      case 5 =>
        println("Digite um valor:")
        var r1 = entrada.nextDouble()
        println()
        println("Resultado: " + raiz(r1))
        println()
        menu()
      case 6 =>
        println("Digite o valor da base:")
        var r1 = entrada.nextDouble()
        println("Digite o valor do expoente:")
        var r2 = entrada.nextDouble()
        println()
        println("Resultado: " + exponencial(r1,r2))
        println()
        menu()
      case 7 =>
        println("Digite o valor :")
        var r1 = entrada.nextDouble()
        println("Digite a base do logaritmo :")
        var r2 = entrada.nextDouble()
        println()
        println("Resultado: " + logaritmo(r1,r2))
        println()
        menu()
      case 8 =>
        println("Digite o angulo :")
        var r1 = entrada.nextDouble()
        println()
        println("Resultado: " + seno(r1))
        println()
        menu()
      case 9 =>
        println("Digite o angulo :")
        var r1 = entrada.nextDouble()
        println()
        println("Resultado: " + cos(r1))
        println()
        menu()
      case 10 =>
        println("Digite o angulo :")
        var r1 = entrada.nextDouble()
        println()
        println("Resultado: " + tan(r1))
        println()
        menu()
      case 11 =>
        println("Digite o valor :")
        var r1 = entrada.nextDouble()
        println("Digite o 2 valor :")
        var r2 = entrada.nextDouble()
        println()
        println("Resultado: " + mod(r1,r2))
        println()
        menu()
      case 12 =>
        println("Digite o valor :")
        var r1 = entrada.nextDouble()
        println()
        println("Resultado: " + fat(r1))
        println()
        menu()
      case 13 =>
        println("Digite o expoente :")
        var r1 = entrada.nextDouble()
        println()
        println("Resultado: " + exponencialE(r1))
        println()
        menu()
      case 14 =>
        println("Programa encerrado com sucesso")
    }
  }
}
