import Array._
package scalaForBigenner{

object vid13_concat_array {
  def main(args: Array[String]): Unit = {
    var myList1 = Array(1, 2, 3, 4, 5, 6)
    var myList2 = Array(11, 12, 13, 14, 15, 16)

    var myList3 = concat(myList1, myList2)

    for (x <- myList3) {
      println(x)
    }
  }
}
}
