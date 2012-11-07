package org.test.fun.lang

import scala.Int

object FunctionParam {

  def main(argv : Array[String]) {
    println("multiply 2 * 3 = " + doOpOnPair(2, 3, (x, y) => x * y))
    For(1, 5) {
      println("printing ...")
    }
  }

  def doOpOnPair(x : Int, y : Int, f : (Int, Int) => Int) : Int = {
    f(x, y)
  }

  def For(min : Int, max : Int)(op : => Unit) {
    var i = min
    while (i <= max) {
      op
      i += 1
    }
  }
}
