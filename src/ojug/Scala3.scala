package ojug

class Scala3 {
  val list = List(1, 2, 3)

  def sum() = {
    list.foldLeft(0)(new Function2[Int, Int, Int]() {
      def apply(sum: Int, i: Int): Int = {
        return sum + i
      }
    })
  }
}

object Scala3 {
  def main(args: Array[String]) {
    println(new Scala3().sum())
  }
}