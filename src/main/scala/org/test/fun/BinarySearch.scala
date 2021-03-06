package org.test.fun

object BinarySearch {
	def main(argv: Array[String]) = {
	  if (argv.length == 0) { 
	    println("usage: program number"); 
	    System.exit(-1) 
	  }
	  val values = Array(10, 11, 15, 20, 22, 29, 35, 50)
	  val index = binarySearch(0, values.length - 1, values, argv(0).toInt)
	  if (index >= 0) {
	    println("found number at position: " + index)
	  } else {
	    println("Not found")
	  }
	}
	
	def binarySearch(left: Int, right: Int, values: Array[Int], target: Int) : Int = {
	    val index: Int = (left + right) / 2;
	    index match {
	      case not_found if right < left => -1
	      case lower if target < values(index) => {println("less than " + values(index)); binarySearch(0, index - 1, values, target)}
	      case higher if target > values(index) => {println("more than " + values(index)); binarySearch(index + 1, right, values, target)}
	      case match_found if target == values(index) => {println("found at " + index); index}
	    }
	}
}
