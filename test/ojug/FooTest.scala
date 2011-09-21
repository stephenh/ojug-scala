package ojug

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

@org.junit.runner.RunWith(classOf[org.scalatest.junit.JUnitRunner])
class FooTest extends WordSpec with ShouldMatchers {
  "SomeComponent" when {
    "handling this sort of input" should {
      var input = "shared"

      "do the right thing" in {
        val s = input + "foo"
        // this:
        s should be === "sharedfoo"
        // is the same thing as:
        s.should(be.===("sharedfoo"))
      }

      "do the right thing again" in {
        val s = input + "bar"
        s should be === "sharedbar"
      }
    }
  }
}