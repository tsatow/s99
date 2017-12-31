package tsatow

import org.scalatest._
import tsatow.P12._

class P12Spec extends FlatSpec with Matchers {
  "The P12" should "return collect answer" in {
    decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) shouldEqual List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  }
}
