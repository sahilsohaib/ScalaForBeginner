package scalaForBigenner

class vid4_private_members {
  class outer{
    class inner{
      private def f(): Unit ={
        println("f")
      }
      class innermost {
        f()
      }
    }
    //we cannot recall the function f() in outer class .we can recall the function f() in inner class.
    //example is given below:

    //(new inner) .f()
  }

}
