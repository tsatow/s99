package tsatow

import tsatow.ListUtils._

object P19 {
  def rotate[A](n: Int, list: List[A]): List[A] = {
    if (n < 0) {
      val (l1, l2) = P17.split(-n, reverse(list))
      reverse(addAll(l2, l1))
    } else {
      val (l1, l2) = P17.split(n, list)
      addAll(l2, l1)
    }
  }
}