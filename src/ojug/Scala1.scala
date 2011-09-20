package ojug

// var, methods, val
class Scala1 {
  var name: String = null

  def foo(name: String) = {
    this.name = name
  }
}

object Scala1Client {
  def main(args: Array[String]) {
    val one = new Scala1
    one.name = "blah"
    println(one.name)
  }
}