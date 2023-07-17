package scalaForBigenner

object vid6_for_loop_in_condition {
  def main(args: Array[String]): Unit = {
    var x:Int=30
    var numlist = List(11,20,34,49,25,96,27)
    for(x<-numlist if x!=11 if x<50){
      println("the value of the x is " +x )
    }
  }

}
