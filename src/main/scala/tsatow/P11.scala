package tsatow

import ListUtils._

object P11 {
  def encodeModified[A](list: List[A]): List[Any] = {
    map(P10.encode(list))({
      case (1, e) => e
      case t      => t
    })
  }
}