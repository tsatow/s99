package tsatow

import tsatow.ListUtils._

object P24 {
  def lotto(n: Int, e: Int): List[Int] = {
    P23.randomSelect(n, P22.range(1, e))
  }
}