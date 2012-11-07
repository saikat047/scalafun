package org.test.fun.lang

object StrangeScala {

  def main(argv : Array[String]) {
    you make it print "saikat"
  }

  def you() : Stranger = {
    print("i am ")
    new Stranger
  }

  def it() : It = new It

  class Stranger {
    def make(it : It) : Stranger = {
      scala.Predef.print("making it ")
      this
    }
    def print(message : String) = scala.Predef.print("print " + message)
  }

  class It {
  }
}
