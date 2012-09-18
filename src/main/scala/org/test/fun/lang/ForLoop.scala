package org.test.fun.lang

object ForLoop {
	def main(argv: Array[String]) {
	  println("Working with custom For loop...")
	  
	  var i : Int = 0;
	  For(i = 0, i < 10, i += 1) {
	    println("i = " + i)
	  }
	}
	
	def For(init: => Unit, cond: => Boolean, inc: => Unit)(opBody: => Unit) = {
	  init
	  while(cond) {
	    opBody
	    inc
	  }
	}
}
