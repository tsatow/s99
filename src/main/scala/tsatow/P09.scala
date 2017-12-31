package tsatow

object P09 {
  def pack[A](list: List[A]): List[List[A]] = {
    @annotation.tailrec
    def go(acc: List[List[A]], list: List[A]): List[List[A]] = list match {
      case e :: rest => acc match {
        case (prevs@(p :: _)) :: accRest if e == p => go((e :: prevs) :: accRest, rest)
        case _ :: _                                => go(List(e) :: acc, rest)
        case Nil                                   => go(List(List(e)), rest)
      }
      case Nil       => acc
    }

    P05.reverse(go(Nil, list))
  }
}