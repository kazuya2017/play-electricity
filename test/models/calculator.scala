import net.svil.bootcamp.electricity.Models._

import org.scalatestplus.play._
import java.time.LocalDateTime

class SimpleFlatRateComputation extends PlaySpec{
  "Calculator" must {
    "return correct value in FlatRate" in {
      val flatRatePlan = new FlatRatePlan("test", 1000, 0.1)
      val history = new History( Map(
                                  LocalDateTime.parse("2020-11-01T00:00:00") -> 100,
                                  LocalDateTime.parse("2020-11-01T01:00:00") -> 200
                                ))
      Calculator.accumelate(history, flatRatePlan) must be (1030)
      
    }
  }

}
