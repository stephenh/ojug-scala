package ojug

class Scala2 {
  val list = List.apply(1, 2, 3)

  def listForeach() {
    list.foreach(new Function1[Int, Unit]() {
      def apply(i: Int): Unit = {
        println(i)
      }
    })
  }

}

object Scala2 {
  def main(args: Array[String]) {
    new Scala2().listForeach()
  }
}