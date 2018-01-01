package tsatow

import org.scalatest._
import tsatow.P25._

class P25Spec extends FlatSpec with Matchers {
  "The P25" should "return collect answer" in {
    val param = List('a, 'b, 'c, 'd, 'e, 'f)
    val res = randomPermute(param)
    res.size                      shouldEqual param.size
    (res == param)                shouldEqual false
    res.sortBy(s => s.toString()) shouldEqual param.sortBy(s => s.toString())
  }
}
