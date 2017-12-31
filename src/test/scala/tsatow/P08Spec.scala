package tsatow

import org.scalatest._
import tsatow.P08._

class P08Spec extends FlatSpec with Matchers {
  "The P08" should "return collect answer" in {
    compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List('a, 'b, 'c, 'a, 'd, 'e)
  }
}
