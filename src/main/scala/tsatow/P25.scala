package tsatow

import tsatow.ListUtils._

object P25 {
  def randomPermute[A](l: List[A]): List[A] = {
    P23.randomSelect(length(l), l)
  }
}