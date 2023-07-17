package scalaForBigenner

class vid4_protected_members {
  class Super {
    protected def f() {
      println("f")
    }

    class Sub extends Super {
      f()
    }
    }
  class other {
   // (new Super).f()
  }
}
