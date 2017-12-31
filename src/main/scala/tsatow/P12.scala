package tsatow

import tsatow.ListUtils._

object P12 {
  def decode[A](list: List[(Int, A)]): List[A] = {
    flatMap(list)({
      case (n, e) => repeat(e, n)
    })
  }
}