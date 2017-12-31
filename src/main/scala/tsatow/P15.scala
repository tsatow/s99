package tsatow

import tsatow.ListUtils._

object P15 {
  def duplicateN[A](n: Int, list: List[A]): List[Any] = {
    flatMap(list)(e => repeat(e, n))
  }
}