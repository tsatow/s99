package tsatow

import org.scalatest._
import tsatow.P11._

class P11Spec extends FlatSpec with Matchers {
  "The P11" should "return collect answer" in {
    encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  }
}
