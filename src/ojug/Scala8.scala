package ojug

trait FooTrait {
  def foo() = 3
}

trait BarTrait {
  def bar() = 4
}

abstract class BaseClass

object Scala8 extends BaseClass with FooTrait with BarTrait {
  def main(args: Array[String]) {
    println(this.foo() + this.bar())

    val a = new Object with FooTrait
    println(a.foo())
  }
}