package tsatow

import org.scalatest._
import tsatow.P13._

class P13Spec extends FlatSpec with Matchers {
  "The P13" should "return collect answer" in {
    encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  }
}
