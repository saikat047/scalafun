package org.test.fun

object ScalaClosure {
	def main(argv: Array[String]) {
	  if (argv.length == 0) {
	    println("usage: program value [value...] filter-min");
	    System.exit(-1);
	  }
	  
	  val values: Array[Int] = argv.slice(0, argv.length - 1).map(_.toInt)
			  						.filter(x => x > argv.last.toInt)
	  values.foreach(f => println(f))
	}
}
