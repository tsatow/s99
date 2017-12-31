package tsatow

import ListUtils._

object P10 {
  def encode[A](list: List[A]): List[(Int, A)] = {
    // map だとNilの場合にエラーにするのが少しダサい気がするのでflatMapを使う
    flatMap(P09.pack(list))({
      case l@(e :: _) => List((l.size, e))
      case Nil        => Nil
    })
  }
}