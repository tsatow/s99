package tsatow

object P11 {
  def encodeModified[A](list: List[A]): List[Any] = {
    // TODO 男らしくmapも使わないバージョンにする
    P10.encode(list) map {
      case (1, e) => e
      case t      => t
    }
  }
}