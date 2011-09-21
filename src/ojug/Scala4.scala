package ojug

class Scala4 {
  val m = Map(1 -> "one", 2 -> "two", 3 →  "three")
  // val m = Map.apply(new Tuple2[Int, String](1, "one"), new Tuple2[Int, String](2, "two"), new Tuple2[Int, String](3, "three"))

  def mapByNumberOfLetters = {
    m.map(new Function1[Tuple2[Int, String], Int]() {
      def apply(entry: Tuple2[Int, String]): Int = {
        entry._2.length()
      }
    })

    // or:
    m.map(entry => entry._2.length())

    // or:
    m.map(_._2.length())
  }
}

object Scala4 {
  def main(args: Array[String]) {
    println(new Scala4().mapByNumberOfLetters)
  }
}