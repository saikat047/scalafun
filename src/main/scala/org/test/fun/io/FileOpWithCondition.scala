package org.test.fun.io

import scala.io.Source
import scala.io.BufferedSource

object FileOpWithCondition {
	def main(argv: Array[String]) {
		val file = new MagicalFile("/tmp/FileOp.txt")
		println("Absolute path: " + file.absolutePath)
		println("Name: " + file.source.getName())
		println("Source: " + file.source)
		println("Source 2: " + file.source2())
		file.ifExists() {
			println("File content:")
			Source.fromFile(file.source).getLines().foreach(line => println(line))	    
		}
	}

	class MagicalFile(filePath: String) {
		def source = new java.io.File(filePath)
		def source2() = new java.io.File(filePath)

		def absolutePath() : String = {
				return source.getAbsolutePath()
		}

		def ifExists()(op: => Unit) = {
			if (source.exists()) {
				op
			}
		}
	}
}
