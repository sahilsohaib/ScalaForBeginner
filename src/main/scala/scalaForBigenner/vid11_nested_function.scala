package scalaForBigenner

object vid11_nested_function {
  def main(args: Array[String]): Unit = {
    println(factorial(0))
    println(factorial(1))
    println(factorial(2))
    println(factorial(3))
  }

  def factorial(i: Int): Int = {
    def fact(i:Int,a:Int):Int ={
    if (i <= 1)
      a
    else
      fact(i - 1, i * a)
    }

  fact(i,1)
}
}
