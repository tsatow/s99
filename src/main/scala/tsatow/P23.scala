package tsatow

import tsatow.ListUtils._

object P23 {
  // 自分のFP in Scalaの回答からパクった
  case class RNG(seed: Long) {
    def nextInt: (Int, RNG) = {
      val newSeed = (seed * 0x5DEECE66DL + 0xBL) & 0xFFFFFFFFFFFFL
      val nextRNG = RNG(newSeed)
      val n = (newSeed >>> 16).toInt
      (n, nextRNG)
    }
    def nonNegativeInt(rng: RNG): (Int, RNG) = {
      val result@(n, nextRNG) = rng.nextInt
      if (n == Int.MinValue) {
        // 0だけ確率が異なるので対応する数値のないMinValueは0に割り当てる
        (0, nextRNG)
      } else if (n < 0) {
        (-n, nextRNG)
      } else {
        result
      }
    }
  }
  // 型クラスで加算単位と加算方法と比較方法を定義させれば一般化できそう
  // nがlの長さより大きい場合はとりまエラーにしておく(removeAtでそうなるはず)
  def randomSelect[A](n: Int, l: List[A]): List[A] = {
    @annotation.tailrec
    def go(rng: RNG, moreSize: Int, acc: List[A], list: List[A]): List[A] = list match {
      case Nil    => acc
      case _ :: _ =>
        val (n, nextRNG) = rng.nonNegativeInt(rng)
        val (rest, e) = P20.removeAt(n % length(list), list)
        val acc2 = e :: acc

        if (moreSize > 1) {
          go(nextRNG, moreSize - 1, e :: acc, rest)
        } else {
          acc2
        }
    }

    // 純粋にランダムではなく参照透明になってしまうけど...
    go(RNG(n), n, Nil, l)
  }
}