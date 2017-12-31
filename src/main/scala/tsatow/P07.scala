package tsatow

object P07 {
  def flatten(list: List[Any]): List[Any] = {
    // TODO 末尾再帰にできぬ できぬのだ!!
    def go(acc: List[Any], maybeList: Any): List[Any] = maybeList match {
      case e :: rest => go(go(acc, e), rest)
      case Nil       => acc
      case e         => e :: acc
    }

    P05.reverse(go(Nil, list))
  }
}