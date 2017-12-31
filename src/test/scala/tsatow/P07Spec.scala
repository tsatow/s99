package tsatow

import org.scalatest._
import tsatow.P07._

class P07Spec extends FlatSpec with Matchers {
  "The P07" should "return collect answer" in {
    flatten(List(List(1, 1), 2, List(3, List(5, 8)))) shouldEqual List(1, 1, 2, 3, 5, 8)
    flatten(List(List(1, 1), 2, List(3, List(5, 8)), Nil)) shouldEqual List(1, 1, 2, 3, 5, 8)
  }
}
