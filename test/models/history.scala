import net.svil.bootcamp.electricity.Models._
import org.scalatestplus.play._
import java.time.LocalDateTime

// add csvloader into history
class CsvLoaderTest extends PlaySpec{
    "history" must{
    "return correct type of CsvLoader" in {
        val src = getClass.getResource("HomeEnergyLogs.csv").getPath
        val data = CsvLoader.load(src)
        data mustBe a[Map[LocalDateTime, Long]]
        }
    }
}