package org.test.fun.lang

object ObjectFactoryMethod {
	def main(argv: Array[String]) {
	  val saikat = Person("Saikat")
	  val shishir = Person(26)
	  val obama = new Person("Obama", 40)
	  
	  println("saikat: " + saikat + ", shishir: " + shishir + ", obama: " + obama)
	}
	
	object Person {
	  def apply(name: String) : Person = {
	    new Person(name, -1)
	  }

	  def apply(age: Int) : Person = {
		  new Person("", age)
	  }
	}
	
	class Person(pName: String, pAge: Int) {
	  val name = pName
	  val age = pAge
	  
	  def sayHello(name: String) {
	    println(name + " says, \"Hello " + name + "\".")
	  }
	  
	  override def toString() : String = {
	    "[Name: " + name + ", Age: " + age + "]";
	  }
	}
}
