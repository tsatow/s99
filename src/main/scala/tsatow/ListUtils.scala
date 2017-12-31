package tsatow

object ListUtils {

  def reverse[A](list: List[A]): List[A] = P05.reverse(list)

  // ++の代わり
  def addAll[A](l1: List[A], l2: List[A]): List[A] = {
    @annotation.tailrec
    def go(l1reversed: List[A], l2: List[A]): List[A] = l1reversed match {
      case Nil       => l2
      case e :: rest => go(rest, e :: l2)
    }

    go(reverse(l1), l2)
  }

  def add[A](l1: List[A], e: A): List[A] = {
    addAll(l1, List(e))
  }

  def map[A, B](list: List[A])(f: A => B): List[B] = {
    @annotation.tailrec
    def go(acc: List[B], l: List[A], f: A => B): List[B] = l match {
      case Nil       => acc
      case e :: rest => go(f(e) :: acc, rest, f)
    }

    reverse(go(Nil, list, f))
  }

  def flatten[A](list: List[List[A]]): List[A] = {
    @annotation.tailrec
    def go(acc: List[A], list: List[List[A]]): List[A] = list match {
      case Nil       => acc
      case e :: rest => go(addAll(acc, e), rest)
    }

    go(Nil, list)
  }

  def flatMap[A, B](list: List[A])(f: A => List[B]): List[B] = {
    flatten(map(list)(f))
  }

  def repeat[A](e: A, n: Int): List[A] = {
    @annotation.tailrec
    def go(acc: List[A], e: A, n: Int): List[A] = n match {
      case 0          => acc
      case n if n > 0 => go(e :: acc, e, n - 1)
      case n if n < 0 => sys.error("error")
    }

    go(Nil, e, n)
  }

  def length[A](l: List[A]): Int = {
    @annotation.tailrec
    def go(length: Int, list: List[A]): Int = list match {
      case Nil       => length
      case _ :: rest => go(length + 1, rest)
    }

    go(0, l)
  }
}
