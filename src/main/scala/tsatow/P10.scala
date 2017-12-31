package tsatow

object P10 {
  def encode[A](list: List[A]): List[(Int, A)] = {
    P09.pack(list) flatMap {
      case l@(e :: _) => List((l.size, e))
      case Nil        => Nil
    }
  }
}