package tsatow

import tsatow.ListUtils._

object P21 {
  def insertAt[A](a: A, n: Int, list: List[A]): List[A] = {
    @annotation.tailrec
    def go(a: A, nth: Int, acc: List[A], l: List[A]): List[A] = l match {
      case Nil                   => acc // メソッドシグニチャ的にエラーにせざるを得ない
      case e :: rest if nth == n => addAll(acc, a :: e :: rest)
      case e :: rest             => go(a, nth + 1, add(acc, e), rest)
    }

    go(a, 0, Nil, list)
  }
}