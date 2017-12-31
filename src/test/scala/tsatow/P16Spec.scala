package tsatow

import org.scalatest._
import tsatow.P16._

class P16Spec extends FlatSpec with Matchers {
  "The P16" should "return collect answer" in {
    drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldEqual List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  }
}
