package scalaForBigenner

import scala.util.control.Breaks

object vid9_break_statement_own {
  def main(args: Array[String]): Unit = {
    var x: Int =0
    var numlist=List(1,2,3,4,5,6,7)

    val loop= new Breaks
    loop.breakable{
      for(x<-numlist if x<5){
        println("value of x is :" +x)

      }
     }

  }
}
