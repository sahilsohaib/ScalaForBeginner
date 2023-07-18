package scalaForBigenner

object vid11_array {
  def main(args: Array[String]): Unit = {

    var myList = Array(1, 2,2, 3, 4, 5, 6, 7, 8, 9)

    for (x <- myList) {
      println(x)
    }
    var total = 0
    for (i <- myList) {
      total = total + i
    }
    println("total is " + total)
    var max = myList(0)
    for (i <- myList) {
      if (i > max)
        max = i

    }
    println("the max is " + max)


  }

}
