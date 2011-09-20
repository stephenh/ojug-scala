package ojug

import scala.collection.mutable.ArrayBuffer

object Scala7 {
  def main(args: Array[String]) {
    val oos = new ArrayBuffer[Any]()
    oos += "string"
    oos += 1
    printAll(oos)

    val strings = new ArrayBuffer[String]()
    strings += "string2"
    // printAll(strings)
    // val oos2: ArrayBuffer[Any] = strings
    // oos2 += 1
  }

  private def printAll(o: ArrayBuffer[Any]) {
    o.foreach(println)
  }
}