package tsatow

object P04 {
  def length[A](list: List[A]): Int = {
    @annotation.tailrec
    def go(l: Int, list: List[A]): Int = list match {
      case Nil       => l
      case _ :: rest => go(l + 1, rest)
    }
    go(0, list)
  }
}