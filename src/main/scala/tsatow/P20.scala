package tsatow

import tsatow.ListUtils._

object P20 {
  def removeAt[A](n: Int, list: List[A]): (List[A], A) = {
    @annotation.tailrec
    def go(nth: Int, acc: List[A], l: List[A]): (List[A], A) = l match {
      case Nil                   => sys.error("error") // メソッドシグニチャ的にエラーにせざるを得ない
      case e :: rest if nth == n => (addAll(acc, rest), e)
      case e :: rest             => go(nth + 1, add(acc, e), rest)
    }

    go(0, Nil, list)
  }
}