package ojug

class Scala6(arg1: String, arg2: String) {
  val both = arg1 + arg2

  println(both)
}

object Scala6 {
  def main(args: Array[String]) {
    val s6 = new Scala6("a", "b")
    println(s6.both)
  }
}

// subclass