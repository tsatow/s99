package tsatow

import tsatow.ListUtils._

object P26 {
  def combinations[A](n: Int, l: List[A]): List[List[A]] = l match {
    case _         if n > length(l) => Nil // errorではなくNilとしておく
    case Nil                        => Nil
    case e :: rest if n >  1        => addAll(combinations(n - 1, rest).map(e :: _), combinations(n, rest))
    case e :: rest if n == 1        => List(e) :: combinations(n, rest)
    case _ :: _    if n <= 0        => Nil
  }
}