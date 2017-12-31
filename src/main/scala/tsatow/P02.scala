package tsatow

object P02 {
  @annotation.tailrec
  def penultimate[A](l: List[A]): A = l match {
    case Nil           => sys.error("error")
    case _ :: Nil      => sys.error("error")
    case p :: _ :: Nil => p
    case _ :: rest     => penultimate(rest)
  }
}