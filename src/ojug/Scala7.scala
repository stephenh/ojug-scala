package ojug

import scala.collection.mutable.ArrayBuffer

object Scala7 {
  def main(args: Array[String]) {
    val listOfAnything = ArrayBuffer[Any]("string", 1)
    printAll(listOfAnything)
    addSomething(listOfAnything)

    val strings = ArrayBuffer("string", "a")
    // compile error because ArrayBuffer is mutable;
    // would put a non-string into ArrayBuffer[String]
    // addSomething(strings)
    // this is okay, the Seq interface is immutable, so
    // can't have/ non-strings put in to it
    printAll(strings)
  }

  private def printAll(o: Seq[Any]) {
    o.foreach(println)
  }

  private def addSomething(o: ArrayBuffer[Any]) {
    o += 1
  }
}