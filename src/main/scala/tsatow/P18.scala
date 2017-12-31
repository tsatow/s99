package tsatow

import tsatow.ListUtils._

object P18 {
  def slice[A](l: Int, k: Int, list: List[A]): List[A] = {
    @annotation.tailrec
    def go(nth: Int, acc: List[A], list: List[A]): List[A] = list match {
      case Nil                              => acc
      case e :: rest if l <= nth && nth < k => go(nth + 1, add(acc, e), rest)
      case _ :: rest                        => go(nth + 1, acc,         rest)
    }

    go(0, Nil, list)
  }
}