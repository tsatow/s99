package tsatow

import org.scalatest._
import tsatow.P21._

class P21Spec extends FlatSpec with Matchers {
  "The P21" should "return collect answer" in {
    insertAt('new, 1, List('a, 'b, 'c, 'd)) shouldEqual List('a, 'new, 'b, 'c, 'd)
  }
}
