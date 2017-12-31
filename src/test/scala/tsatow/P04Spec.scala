package tsatow

import org.scalatest._
import tsatow.P04._

class P04Spec extends FlatSpec with Matchers {
  "The P04" should "return collect answer" in {
    P04.length(List(1, 1, 2, 3, 5, 8)) shouldEqual 6
  }
}
