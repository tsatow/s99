package tsatow

import tsatow.ListUtils._

object P22 {
  // 型クラスで加算単位と加算方法と比較方法を定義させれば一般化できそう
  def range(begin: Int, end: Int): List[Int] = {
    @annotation.tailrec
    def go(acc: List[Int], begin: Int, end: Int): List[Int] = {
      if (begin > end) {
        acc
      } else {
        go(begin :: acc, begin + 1, end)
      }
    }

    reverse(go(Nil, begin, end))
  }
}