package ojug

class Scala6(arg1: String, arg2: String) {
  val both = arg1 + arg2

  // this line is implicitly in the "this(arg1, arg2)" cstr
  println(both)

  // can provide alternate cstrs with "this(arg1)"
  def this(arg1: String) = this(arg1, "default")
}

object Scala6 {
  def main(args: Array[String]) {
     new Scala6("a", "b")
     new Scala6("a")
  }
}
