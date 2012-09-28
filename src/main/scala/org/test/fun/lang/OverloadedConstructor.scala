package org.test.fun.lang

object OverloadedConstructor {
	
	def main(argv: Array[String]) {
	  val saikat = new Person("Saikat", 29)
	  val shishir = new Person("Shishir")
	  val unknown = new Person(29)
	  
	  println("saikat: " + saikat + ", shishir: " + shishir + ", unknown: " + unknown)
	}
	
	class Person(pName: String, pAge: Int) {
		val name = pName
		val age = pAge

		def this(pName: String) {
			this(pName, -1)
		}

		def this(pAge: Int) {
			this("", pAge);
		}

		override def toString() : String = {
			"[Name: " + name + ", Age: " + age + "]";
		}
	}
}