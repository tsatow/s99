package tsatow

import org.scalatest._
import tsatow.P23._

class P23Spec extends FlatSpec with Matchers {
  "The P23" should "return collect answer" in {
    randomSelect(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h)) shouldEqual List('a, 'e, 'g)
  }
}