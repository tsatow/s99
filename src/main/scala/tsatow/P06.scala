package tsatow

object P06 {
  def isPalindrome[A](l: List[A]): Boolean = {
    P05.reverse(l) == l
  }
}