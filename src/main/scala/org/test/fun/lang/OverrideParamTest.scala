package org.test.fun.lang

object OverrideParamTest {
	def main(argv: Array[String]) {
	  val duck = new NamedDuck("Saikat")
	  val maleDuck = new NamedMaleDuck("Shishir")
	  val unknownMaleDuck = new UnknownMaleDuck()
	  duck.quack()
	  maleDuck.quack()
	  unknownMaleDuck.quack()
	  duck.hello
	  maleDuck.hello
	  unknownMaleDuck.hello
	}
	
	class NamedDuck(name: String) {
	  def getName() = name
	  
	  def quack() = {
	    println(getName + " quacks")
	  }
	  
	  def hello() = {
	    println(getName + " says hello!")
	  }
	}
	
	class NamedMaleDuck(name: String) extends NamedDuck(name: String) {
	  override def getName() = name + " alpha"
	  
	  override def quack() = {
	    println(getName + " quacks as a male duck")
	  }
	}
	
	class UnknownMaleDuck extends NamedMaleDuck("Unknown Agent") {
	}
}