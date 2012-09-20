package org.test.fun.lang

object OverrideTest {

  def main(argv: Array[String]) {
    val duck : Duck = new Duck()
    val blackDuck : BlackDuck = new BlackDuck()
    
    duck.quack()
    blackDuck.quack()
    blackDuck.blackQuack()
  }
  
  class Duck {
    def getName() = "Duck"
    
    def quack() = {
      println(getName + " quacks")
    }
  }
  
  class BlackDuck extends Duck {
    def getBlackName() = "Black Duck"
      
    def blackQuack() = {
      println(getName + " quacks in its own class")
    }
    
    override def quack() : Unit = {
      println(getName + " overrides quack")
    }
  }
}
