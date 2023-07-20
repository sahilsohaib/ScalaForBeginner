package scalaForBigenner



object vid16_more_on_list {
  def main(args: Array[String]): Unit = {
    val fruit: List[String] =List("apple","orange" ,"pears")
    val fruit1: List[String] = List("mangoes" ,"banana")

    var vijay :List[String] = fruit ::: fruit1
    println("vijay"  +vijay)

    // method 2 to join two list

    var raman :List[String]=List.concat(fruit,fruit1)
    println("raman"  +raman)
  }
}
