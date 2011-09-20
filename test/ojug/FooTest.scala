package ojug

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

@org.junit.runner.RunWith(classOf[org.scalatest.junit.JUnitRunner])
class FooTest extends WordSpec with ShouldMatchers {
  "SomeComponent" when {
    "handling this sort of input" should {
      val shared = "shared"
      "do the right thing" in {
        val s = shared + "foo"
        s should be === "sharedfoo"
      }
      "do the right thing again" in {
        val s = shared + "bar"
        s should be === "sharedbar"
      }
    }
  }
}