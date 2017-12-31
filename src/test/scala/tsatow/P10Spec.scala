package tsatow

import org.scalatest._
import tsatow.P10._

class P10Spec extends FlatSpec with Matchers {
  "The P10" should "return collect answer" in {
    encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  }
}
