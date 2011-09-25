package ojug

class Scala2 {
  val list = List.apply("1", "2")

  def listForeach() {
    list.foreach(new Function1[String, Unit]() {
      def apply(i: String): Unit = {
        println(i)
      }
    })

    // or:
    list.foreach((s: String) => println(s))

    // or:
    list.foreach(s => println(s))

    // or:
    list.foreach(println)
  }
}

object Scala2 {
  def main(args: Array[String]) {
    new Scala2().listForeach()
  }
}