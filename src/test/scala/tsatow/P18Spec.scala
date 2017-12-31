package tsatow

import org.scalatest._
import tsatow.P18._

class P18Spec extends FlatSpec with Matchers {
  "The P18" should "return collect answer" in {
    slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldEqual List('d, 'e, 'f, 'g)
  }
}
