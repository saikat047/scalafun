package org.test.fun

object BinarySearch {
	def main(argv: Array[String]) = {
	  if (argv.length == 0) { println("usage: program number"); System.exit(-1) }
	  val values = Array(10, 11, 15, 20, 22, 29, 35, 50)
	  val target = argv(0).toInt;
	  var left: Int = 0;
	  var right: Int = values.length - 1;
	  
	  var found: Boolean = false;
	  var index: Int = binarySearch(0, values.length - 1, values, target)
	  if (index >= 0) {
	    println("found number: " + target + " at position: " + index)
	  } else {
	    println("Not found")
	  }
	}
	
	def binarySearch(left: Int, right: Int, values: Array[Int], target: Int) : Int = {
	    val index: Int = (left + right) / 2;
	    index match {
	      case not_found if right < left => return -1
	      case lower if target < values(index) => {println("less than " + values(index)); return binarySearch(0, index - 1, values, target)}
	      case higher if target > values(index) => {println("more than " + values(index)); return binarySearch(index + 1, right, values, target)}
	      case match_found if target == values(index) => {println("found at " + index); return index}
	    }
	}
}
