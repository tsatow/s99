package tsatow

object P03 {
  @annotation.tailrec
  def nth[A](n: Int, l: List[A]): A = (n, l) match {
    case (0, e :: _)             => e
    case (k, _ :: rest) if k > 0 => nth(k - 1, rest)
    case (_, Nil)                => sys.error("error")
  }
}