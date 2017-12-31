package tsatow

object P13 {
  // ローカルメソッドがないと末尾再帰にするのは無理と思うけど、
  // 問題を見る限りローカルメソッド使ったら意味がなさそうなので使わない。
  def encodeDirect[A](list: List[A]): List[(Int, A)] = list match {
    case Nil => Nil
    case e :: rest => encodeDirect(rest) match {
      case Nil                  => (1, e) :: Nil
      case (prev@(n, p)) :: acc =>
        if (e == p) {
          (n + 1, p) :: acc
        } else {
          (1, e) :: prev :: acc
        }
    }
  }
}