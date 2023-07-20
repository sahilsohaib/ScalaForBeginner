package scalaForBigenner

object vid15_List {
  def main(args: Array[String]): Unit = {

    val fruit:List[String]= List("apple", "orange")
    val numbers:List[Int] =List(1,2,3,4)

    val dim: List[List[Int]]= List(List(1,2,3), List(4,5,6),List(7,8,9))

    println("head" + fruit.head)
    println("tail" + numbers.tail)
    println("Empty" + dim.isEmpty)
    



  }

}
