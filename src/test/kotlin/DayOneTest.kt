import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DayOneTest {
    private val dayOne = DayOne()
    private val input = javaClass.getResource("day1-input.txt")!!.readText().lines().map { it.toInt() }

    @Test
    fun `Should return measurements larger than previous`() {
        val solution = dayOne.sonarSweepFirstPartSolution(input)

        assertThat(solution).isEqualTo(1709)
    }

    @Test
    fun `Should sum each of three-measurement window`() {
        val solution = dayOne.sonarSweepSecondPartSolution(input)

        assertThat(solution).isEqualTo(1761)
    }
}