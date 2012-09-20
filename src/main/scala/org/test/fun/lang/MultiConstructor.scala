package org.test.fun.lang

object MultiConstructor {

  def main(argv: Array[String]) {
    val duck = new Duck("Saikat")
    val duck2 = new Duck(30)
    val duck3 = new Duck(true)
    
    duck.quack
    duck2.quack
    duck3.quack
  }
  
  class Duck(name: String, age: Int, honesty: Boolean) {
    val dName = name
  	val dAge = age
  	val dHonesty = honesty
  	
    def this(name: String) = {
    	this(name, 0, false)
    }
    def this(age: Int) {
    	this(null, age, false)
    }
    def this(honesty: Boolean) {
    	this(null, 0, honesty)
    }
    
    def quack() = {
      if (dName != null) println("name: " + dName)
      if (dAge != 0) println("age: " + dAge)
      if (dHonesty) println("honesty: " + dHonesty)
    }
  }
}
