package tsatow

import org.scalatest._
import tsatow.P14._

class P14Spec extends FlatSpec with Matchers {
  "The P14" should "return collect answer" in {
    duplicate(List('a, 'b, 'c, 'c, 'd)) shouldEqual List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  }
}
