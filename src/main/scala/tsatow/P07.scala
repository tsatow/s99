package tsatow

import tsatow.ListUtils._

object P07 {
  @annotation.tailrec
  def flatten(list: List[Any]): List[Any] = {
    @annotation.tailrec
    def go(acc: List[Any], maybeList: List[Any]): List[Any] = maybeList match {
      case (l: List[Any]) :: rest => go(addAll(acc, l), rest)
      case e :: rest              => go(add(acc, e), rest)
      case Nil                    => acc
    }

    if (forall(list, (e => !e.isInstanceOf[List[Any]]): Any => Boolean)) {
      list
    } else {
      flatten(go(Nil, list))
    }
  }
}