package tsatow

object P01 {
  @annotation.tailrec
  def last[A](l: List[A]): A = l match {
    case Nil       => sys.error("error")
    case e :: Nil  => e
    case _ :: rest => last(rest)
  }
}