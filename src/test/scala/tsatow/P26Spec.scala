package tsatow

import org.scalatest._
import tsatow.P26._

class P26Spec extends FlatSpec with Matchers {
  "The P26" should "return collect answer" in {
    combinations(1, List('a, 'b, 'c, 'd, 'e, 'f)) shouldEqual List(List('a), List('b), List('c), List('d), List('e), List('f))
    combinations(3, List('a, 'b, 'c, 'd, 'e, 'f)) shouldEqual List(
      List('a, 'b, 'c),
      List('a, 'b, 'd),
      List('a, 'b, 'e),
      List('a, 'b, 'f),
      List('a, 'c, 'd),
      List('a, 'c, 'e),
      List('a, 'c, 'f),
      List('a, 'd, 'e),
      List('a, 'd, 'f),
      List('a, 'e, 'f),
      List('b, 'c, 'd),
      List('b, 'c, 'e),
      List('b, 'c, 'f),
      List('b, 'd, 'e),
      List('b, 'd, 'f),
      List('b, 'e, 'f),
      List('c, 'd, 'e),
      List('c, 'd, 'f),
      List('c, 'e, 'f),
      List('d, 'e, 'f)
    )
    combinations(0, List('a, 'b, 'c, 'd, 'e, 'f)) shouldEqual Nil
    combinations(1, Nil) shouldEqual Nil
    combinations(2, List('a, 'b)) shouldEqual List(List('a, 'b))
  }
}
