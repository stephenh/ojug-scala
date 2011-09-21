package ojug

trait FooTrait {
  def foo() = 3
}

trait BarTrait {
  def bar() = 4
}

abstract class BaseClass

// can only extend one class, but can mixin N traits
object Scala8 extends BaseClass with FooTrait with BarTrait {
  def main(args: Array[String]) {
    println(this.foo() + this.bar())

    // can also add traits on assignment
    val a = new Object with FooTrait
    println(a.foo())
  }
  
  override def foo() = 5

  // bytecode will have a call to a static bar impl
  // def bar() = BarTrait$class.bar(this)

}