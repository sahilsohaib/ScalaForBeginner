package scalaForBigenner

object vid17_map_second_part {
  def main(args: Array[String]): Unit = {
    val colours = Map( "a"-> "Vijay" , "b"-> "ajay", "c"-> "raman")
    val colours1 =Map( "a"-> "Sahil","b"-> "Samridhi", "c"-> "Sagar")

    var colours3 = colours ++ colours1
    println("colours3" +colours3)






  }

}
