package ojug

class Scala1 {
  // looks like a public field, but ends up as:
  // private String name
  // public String name() { return name; }
  // public void name_$eq(String name) { this.name = name; }
  var name = "foo"

  def foo(name: String) = {
  }
}

object Scala1 {
  def main(args: Array[String]) {
    val one = new Scala1
    // looks like a field reference, but really calls
    // one.name_$eq("blah")
    one.name = "blah"
    println(one.name)
  }
}