package org.test.fun.lang

object StrangeScala {

  def main(argv : Array[String]) {
    you make it print "saikat"
    you suck dude
    you are great
  }

  def stranger() = new Stranger

  def you() : Stranger = {
    print("i ")
    new Stranger
  }

  def it() : It = new It

  def great() = new Great

  def dude : Dude = new Dude

  class Stranger {
    def make(it : It) : Stranger = {
      scala.Predef.print("am making it ")
      this
    }

    def print(message : String) = scala.Predef.println("print '" + message + "'.")

    def suck(dude : Dude) = scala.Predef.println("suck!!!")

    def are(g : Great) {
      scala.Predef.println("am great.")
    }
  }

  class It {}

  class Great {}

  class Dude {}
}
