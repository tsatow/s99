package tsatow

import tsatow.ListUtils._

object P26 {
  def combinations[A](n: Int, l: List[A]): List[List[A]] = l match {
    case Nil                        => Nil
    case _ :: _    if n > length(l) => Nil // 組み合わせが作れない場合は一律Nilとしておく
    case _ :: _    if n <= 0        => Nil // 組み合わせが作れない場合は一律Nilとしておく
    case e :: rest if n == 1        => List(e) :: combinations(n, rest)
    case e :: rest if n >  1        => addAll(combinations(n - 1, rest).map(e :: _), combinations(n, rest))
  }
}