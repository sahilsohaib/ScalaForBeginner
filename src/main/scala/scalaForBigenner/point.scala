package scalaForBigenner

class point(val xc:Int , val yc:Int){
  var x:Int =xc
  var y:Int =yc
  def move(dx:Int, dy:Int): Unit =
  {
    x=dx+xc
    y=dy+yc
    println("point x location:" +x)
    println("point y location:" +y)
  }
}


object Demo1{
  def main(args: Array[String]): Unit = {
    val pt =new point(10,20)
    pt.move(30,40)
  }
}



object Demo2{
  def main(args: Array[String]): Unit = {
    val pt2 =new point(11,22)
    pt2.move(33,44)
  }
}


