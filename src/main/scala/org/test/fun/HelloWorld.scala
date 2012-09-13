package org.test.fun

import org.joda.time.DateTime
import scala.Console

object HelloWorld {
	def main(argv: Array[String]) {
	  println("My Lord, your wish is my command!")
	  val dateTime = DateTime.now()
	  println("Local time: " + dateTime.toString("dd-MM-yyyy kk:mm:ss"))
	  while (true) {
		  val command = Console.readLine();
		  println("My lord wishes: " + command)
		  command.toLowerCase() match {
		    case "ls" => println("My Lord, can't show directory listing!")
		    case "rm" => println("My Lord, removal is not possible!")
		    case _ => println("Servent is unable to understand your command!")
		  }
	  }
	}
}
