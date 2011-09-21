package ojug

class Scala3 {
  val list = List(1, 2, 3)

  def sum(): Int = {
    list.foldLeft(0)(new Function2[Int, Int, Int]() {
      def apply(sum: Int, i: Int): Int = {
        return sum + i
      }
    })

    // or:
    list.foldLeft(0)((sum, i) => sum + i)

    // or:
    list.foldLeft(0)(_ + _)
  }
}

object Scala3 {
  def main(args: Array[String]) {
     val sum = new Scala3().sum()
    println(sum)
  }
}