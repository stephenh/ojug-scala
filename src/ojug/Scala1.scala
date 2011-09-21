package ojug

class Scala1 {
  var name = "foo"

  def foo(name: String) = {
  }
}

object Scala1 {
  def main(args: Array[String]) {
    val one = new Scala1
    one.name = "blah"
    println(one.name)
  }
}