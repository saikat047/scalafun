package org.test.fun.lang

import scala.collection.Map

object CaseClasses {
	def main(argv: Array[String]) {
	  val values : Map[String, String] = Map("x" -> "5") + ("y" -> "9")
	  // 2x + y - 7
	  values.foreach(p => println(p._1 + " = " + p._2))
	  println(eval(minus(plus(mul(const("2"), variable("x")), variable("y")), const("7")), values))
	  
	}
	
	def eval(e: expr, values: Map[String, String]) : String = {
	  e match {
	    case mul(left, right) => eval(left, values) + " * " + eval(right, values)
	    case plus(left, right) => eval(left, values) + " + " + eval(right, values)
	    case minus(left, right) => eval(left, values) + " - " + eval(right, values)
	    case variable(v) => values(v)
	    case const(v) => v
	  }
	}
	
	abstract class expr;
	
	case class plus(left: expr, right: expr) extends expr;
	case class minus(left: expr, right: expr) extends expr;
	case class variable(name: String) extends expr;	
	case class const(value: String) extends expr;
	case class mul(left: expr, right: expr) extends expr;
}
