package org.test.fun

import org.scalatest.junit.{ShouldMatchersForJUnit, JUnitSuite}
import org.junit.{After, Before, Test}
import org.junit.Assert._

class BinarySearchWithJUnit extends JUnitSuite with ShouldMatchersForJUnit {

  @Before def init() {
    println("Executed in before heh!")
  }

  @Test def findNumberUsingBinarySearch() {
    val values : Array[Int] = Array(1,3,6,10,21,30)
    val index = BinarySearch.binarySearch(0, values.length, values, 6)
    assertTrue(index >= 0)
  }

  @Test def binarySearchReturnsNonZero() {
    val values : Array[Int] = Array(1,3,6,10,21,30)
    BinarySearch.binarySearch(0, values.length, values, 6) should equal(2)
  }

  @After def cleanUp() {
    println("Cleaning up the mess created by the tests")
  }
}
