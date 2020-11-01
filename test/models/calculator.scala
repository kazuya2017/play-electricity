import net.svil.bootcamp.electricity.Models._

import org.scalatestplus.play._
import java.time.LocalDateTime

class SimpleFlatRateComputation extends PlaySpec{
  "Calculator" must {
    "return correct value in FlatRate" in {
      val plan = new Plan(10)
      val history = new History( Map(
                                  LocalDateTime.parse("2020-11-01T00:00:00") -> 100,
                                  LocalDateTime.parse("2020-11-01T01:00:00") -> 200
                                ))
      Calculator.accumelate(history, plan) must be (3000)
    }
  }
}
