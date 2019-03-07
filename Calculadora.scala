import Menu._

object Calculadora {

  val e = 2.718281828459045235360287

  def raiz(x: Double): Double = {
    var y = Math.sqrt(x)
    y
  }

  def soma(x: Float, y: Float): Float = {
    var z = x + y
    z
  }

  def subtracao(x: Float, y: Float): Float = {
    var z = x - y
    z
  }

  def multiplicacao(x: Float, y: Float): Float = {
    var z = x * y
    z
  }

  def divisao(x: Float, y: Float): Float = {
    var z = x / y
    z
  }

  def exponencial(x: Double, y: Double): Double = {
    var z = Math.pow(x, y)
    z
  }

  def logaritmo(x: Double, y: Double): Double = {
    var z = Math.log(x) / Math.log(y)
    z
  }

  def seno(x: Double): Double = {
    var z = Math.sin(Math.toRadians(x))
    z
  }

  def cos(x: Double): Double = {
    var z = Math.cos(Math.toRadians(x))
    z
  }

  def tan(x: Double): Double = {
    var z = Math.tan(Math.toRadians(x))
    z
  }

  def mod(x: Double, y: Double): Double = {
    var z = x % y
    z
  }

  def fat(x: Double): Double = {
    var z: Double = 1
    var i: Double = 1
    while (i <= x) {
      z = z * i
      i = i + 1
    }
    z
  }

  def exponencialE(x: Double): Double = {
    var z = Math.pow(e, x)
    z
  }

  def main(args: Array[String]): Unit = {
    menu()
  }
}