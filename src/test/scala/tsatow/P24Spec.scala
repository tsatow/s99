package tsatow

import org.scalatest._
import tsatow.P24._

class P24Spec extends FlatSpec with Matchers {
  "The P24" should "return collect answer" in {
    lotto(6, 49) shouldEqual List(48, 24, 11, 47, 16, 6)
  }
}
