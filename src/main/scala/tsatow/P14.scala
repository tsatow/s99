package tsatow

import tsatow.ListUtils._

object P14 {
  def duplicate[A](list: List[A]): List[A] = {
    flatMap(list)(e => List(e, e))
  }
}