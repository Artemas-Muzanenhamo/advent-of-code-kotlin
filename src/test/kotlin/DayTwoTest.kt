import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DayTwoTest {
    private val dayTwo = DayTwo()

    @Test
    fun `Should sum each of three-measurement window`() {
        val input = listOf(199,200,208,210,200,207,240,269,260,263)
//        val input = javaClass.getResource("day2-input.txt")!!.readText().lines().map { it.toInt() }
        val solution = dayTwo.solution(input)

        assertThat(solution).isEqualTo(5)
    }
}