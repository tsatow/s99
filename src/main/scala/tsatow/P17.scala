package tsatow

import tsatow.ListUtils._

object P17 {
  def split[A](n: Int, list: List[A]): (List[A], List[A]) = {
    @annotation.tailrec
    def go(nth: Int, acc: List[A], l: List[A]): (List[A], List[A]) = l match {
      case Nil                   => (acc, Nil)
      case e :: rest if nth == n => (add(acc, e), rest)
      case e :: rest             => go(nth + 1, add(acc, e), rest)
    }

    // TODO ちょっとアドホックなので暇なときに考え直す
    if (n <= 0) {
      (Nil, list)
    } else {
      go(1, Nil, list)
    }
  }
}