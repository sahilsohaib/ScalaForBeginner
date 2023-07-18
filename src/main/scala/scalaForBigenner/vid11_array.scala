package scalaForBigenner

object vid11_array {
  def main(args: Array[String]): Unit = {

    var myList = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)

    for (x <- myList) {
      println(x)
    }
    var total = 0
    for (i <- 0 to (myList.length - 1)) {
      // if we write total= total + i    then answer is 36 why???
      total = total + myList(i)
    }
    println("total is " + total)

    var max = myList(0)
    for (i <- 1 to (myList.length - 1)) {
      if (myList(i) > max) max = myList(i)

    }
    println("the max is " +max)
  }
}
