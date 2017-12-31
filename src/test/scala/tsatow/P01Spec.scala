package tsatow

import org.scalatest._
import P01._

class P01Spec extends FlatSpec with Matchers {
  "The P01" should "return collect answer" in {
    last(List(1, 1, 2, 3, 5, 8)) shouldEqual 8
  }
}
