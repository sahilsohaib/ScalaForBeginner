package scalaForBigenner

object OOPS_class_point {
  def main(args: Array[String]): Unit = {
    class point(val xc: Int, val yc: Int) {
      var x: Int = xc
      var y: Int = yc

      def move(dx: Int, dy: Int) {
        x = dx + xc
        y = dy + yc
        println("location x is:" + x)
        println("location y is :" + y)
      }
    }
    class Location(override val xc: Int, override val yc: Int, val zc: Int)
      extends point(xc, yc) {
      var z: Int = zc

      def move(dx: Int, dy: Int, dz: Int): Unit = {
        x = dx + xc
        y = dy + yc
        z = dz + zc
        println("Location x is:" + x)
        println("location y is :" + y)
        println("location z is:" + z)
      }
    }
    object demo {
      def main(args: Array[String]): Unit = {
        val pt = new Location(10, 20, 30)

      }
    }

  }
}

