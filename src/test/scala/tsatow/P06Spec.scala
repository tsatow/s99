package tsatow

import org.scalatest._
import tsatow.P06._

class P06Spec extends FlatSpec with Matchers {
  "The P06" should "return collect answer" in {
    isPalindrome(List(1, 2, 3, 2, 1)) shouldEqual true
    isPalindrome(List(1, 2, 3, 2, 2)) shouldEqual false
  }
}
