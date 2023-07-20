 import Array._
package scalaForBigenner {

  object vid14_Range_array {
    def main(args: Array[String]): Unit = {

      var myList1 = range(10,20,2)
      var myList2 = range(10,40,4)


      for(x <- myList1){
        print("  " +x)
      }
      println()
      for(x<- myList2){
        print( " " +x)
      }

    }
  }
}