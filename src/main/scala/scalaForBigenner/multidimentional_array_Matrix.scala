import Array._
package scalaForBigenner{


object multidimentional_array_Matrix {
  def main(args: Array[String]): Unit = {
    var myMatrix = ofDim[Int](3, 3)

    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        myMatrix(i)(j) = j
      }
    }

    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print("  " + myMatrix(i)(j))
      }
      println()
    }
  }
}
}
