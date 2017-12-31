package tsatow

import org.scalatest._
import tsatow.P03._

class P03Spec extends FlatSpec with Matchers {
  "The P03" should "return collect answer" in {
    nth(2, List(1, 1, 2, 3, 5, 8)) shouldEqual 2
  }
}
