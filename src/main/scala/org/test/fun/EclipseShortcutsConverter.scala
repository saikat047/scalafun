package org.test.fun

import java.io.BufferedReader
import java.io.Reader
import java.io.InputStreamReader
import java.io.PrintWriter
import java.io.FileWriter
import scala.io.BufferedSource

object EclipseShortcutsConverter {
	def main(argv: Array[String]) {
	  def fileName = "/eclipse-shortcuts.csv"
	  val bSource: BufferedSource = new BufferedSource(getClass().getResourceAsStream(fileName));
	  val printer: PrintWriter = new PrintWriter(new FileWriter("/tmp/output-cool.html"))
	  printer.println("<html><body><table>")
	  
	  var odd: Boolean = false;
	  bSource.getLines.foreach(line => {
	    val keyValuePair = line.split(",")
    	val shortCut = keyValuePair(0)
    	val desc = keyValuePair(1)
    	odd = !odd;
    	var color:String = null;
    	if (odd) color = "#ddffdd" else color = "#DDEEFF"
    	printer.println("<tr style=\"background-color: " + color + 
    	                ";\"><td>" + shortCut + "</td><td>" + desc + 
    	                "</td></tr>")
	  })
	  printer.println("</table></body></html>")  
	  bSource.close()
	  printer.close()
	}
}
