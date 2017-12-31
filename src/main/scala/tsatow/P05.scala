package tsatow

object P05 {
  def reverse[A](list: List[A]): List[A] = {
    @annotation.tailrec
    def go(acc: List[A], list: List[A]): List[A] = list match {
      case Nil       => acc
      case e :: rest => go(e :: acc, rest)
    }
    go(Nil, list)
  }
}