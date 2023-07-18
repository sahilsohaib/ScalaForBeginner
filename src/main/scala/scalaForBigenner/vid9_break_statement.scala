package scalaForBigenner

import scala.util.control.Breaks

object vid9_break_statement {
  def main(args: Array[String]): Unit = {
    var x:Int =0
    var numlist=List(1,2,3,4,5,6)
    val loop= new Breaks
    loop.breakable{
      for(x<- numlist){
        println("Print the value of x: " +x)
        if(x==4){
          loop.break;
        }
      }
    }
    println("print the break list")
  }

}
