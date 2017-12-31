package tsatow

import tsatow.ListUtils._

object P16 {
  def drop[A](n: Int, list: List[A]): List[A] = {
    @annotation.tailrec
    def go(nth: Int, acc: List[A], l: List[A]): List[A] = l match {
      case Nil                   => acc
      case _ :: rest if nth == n => go(1,       acc,         rest)
      case e :: rest             => go(nth + 1, add(acc, e), rest)
    }

    go(1, Nil, list)
  }
}