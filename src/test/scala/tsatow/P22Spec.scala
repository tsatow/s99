package tsatow

import org.scalatest._
import tsatow.P22._

class P22Spec extends FlatSpec with Matchers {
  "The P22" should "return collect answer" in {
    range(4, 9) shouldEqual List(4, 5, 6, 7, 8, 9)
  }
}
