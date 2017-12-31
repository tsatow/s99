package tsatow

import org.scalatest._
import tsatow.P17._

class P17Spec extends FlatSpec with Matchers {
  "The P17" should "return collect answer" in {
    split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldEqual (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    split(3, List(1, 2, 3)) shouldEqual (List(1, 2, 3),List())
    split(3, List(1, 2)) shouldEqual (List(1, 2),List())
  }
}
