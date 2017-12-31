package tsatow

import org.scalatest._
import tsatow.P15._

class P15Spec extends FlatSpec with Matchers {
  "The P15" should "return collect answer" in {
    duplicateN(3, List('a, 'b, 'c, 'c, 'd)) shouldEqual List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  }
}
