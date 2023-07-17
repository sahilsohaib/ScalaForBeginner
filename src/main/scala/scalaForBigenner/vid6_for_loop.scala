package scalaForBigenner

object vid6_for_loop {
  def main(args: Array[String]): Unit = {


    var x: Int = 10
    var y: Int =10
    for (x <- 1 to 10 ; y <-11 to 20) {
      println("the value of the x is " +x)
      println("The value of the b is " +y)
    }
  }
}
