package tsatow

import org.scalatest._
import tsatow.P02._

class P02Spec extends FlatSpec with Matchers {
  "The P02" should "return collect answer" in {
    penultimate(List(1, 1, 2, 3, 5, 8)) shouldEqual 5
  }
}
