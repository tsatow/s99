package tsatow

import org.scalatest._
import tsatow.P20._

class P20Spec extends FlatSpec with Matchers {
  "The P20" should "return collect answer" in {
    removeAt(1, List('a, 'b, 'c, 'd)) shouldEqual (List('a, 'c, 'd),'b)
  }
}
