package org.test.fun.lang

object WhileLoop {
	def main(argv: Array[String]) {
	  var i : Int = 0;
	  While(i < 5) {
	    i += 1; 
	    println("i = " + i)
	  }
	  println("Finally, i = " + i)
	}
	
	def While(condition: => Boolean)(operationBody: => Unit) = {
	  while (condition) {
		  	operationBody
	  }
	}
}
