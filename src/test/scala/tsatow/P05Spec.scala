package tsatow

import org.scalatest._
import tsatow.P05._

class P05Spec extends FlatSpec with Matchers {
  "The P05" should "return collect answer" in {
    reverse(List(1, 1, 2, 3, 5, 8)) shouldEqual List(8, 5, 3, 2, 1, 1)
  }
}
