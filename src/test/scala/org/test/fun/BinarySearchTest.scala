package org.test.fun

import org.junit.Assert._

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class BinarySearchTest extends FlatSpec with ShouldMatchers {
  "Search" should "find an existing element" in {
    val values : Array[Int] = Array(1,3,6,10,21,30)
    val index = BinarySearch.binarySearch(0, values.length, values, 10)
    index shouldBe 3
  }

  "Search" should "not find an existing element" in {
    val values : Array[Int] = Array(1,3,6,10,21, 30)
    val index = BinarySearch.binarySearch(0, values.length, values, 11)
    assertTrue(index < 0)
  }
}
