package org.test.fun

import java.io.BufferedReader
import java.io.Reader
import java.io.InputStreamReader
import java.io.PrintWriter
import java.io.FileWriter
import scala.io.{Source, BufferedSource}

object EclipseShortcutsConverter {
	def COLOR_ODD = "#ddffdd"
	def COLOR_EVEN = "#DDEEFF"
	  
	def main(argv: Array[String]) {
	  def fileName = "/eclipse-shortcuts.csv"
	  val bSource: BufferedSource = Source.fromInputStream(getClass.getResourceAsStream(fileName));
	  val printer: PrintWriter = new PrintWriter(new FileWriter("/tmp/output-cool.html"))
	  printer.println("<html><body><table>")
	  
	  var odd: Boolean = false;
	  bSource.getLines.foreach(line => {
	    val keyValuePair = line.split(",")
    	val shortCut = keyValuePair(0)
    	val desc = keyValuePair(1)
    	odd = !odd;
    	var color:String = null;
    	if (odd) color = COLOR_ODD else color = COLOR_EVEN
    	printer.println("<tr style=\"background-color: " + color + 
    	                ";\"><td>" + shortCut + "</td><td>" + desc + 
    	                "</td></tr>")
	  })
	  printer.println("</table></body></html>")  
	  bSource.close()
	  printer.close()
	}
}
