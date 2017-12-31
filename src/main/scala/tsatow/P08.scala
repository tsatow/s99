package tsatow

object P08 {
  def compress[A](list: List[A]): List[A] = {
    @annotation.tailrec
    def go(prev: A, acc: List[A], list: List[A]): List[A] = list match {
      case e :: rest => if (e == prev) go(prev, acc, rest) else go(e, e :: acc, rest)
      case Nil       => acc
    }

    list match {
      case Nil       => Nil
      case f :: rest => P05.reverse(go(f, List(f), rest))
    }
  }
}