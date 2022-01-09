import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DayTwoTest {
    private val dayTwo = DayTwo()

    private val testInput = javaClass.getResource("day2-input.txt")!!.readText().lines()
        .map { Pair(it.substringBefore(' ').trim(), it.substringAfter(' ').trim().toInt()) }

    @Test
    fun `Should return product of horizontal total + depth total`() {
        val diveSolution = dayTwo.diveSolution(testInput)

        assertThat(diveSolution).isEqualTo(2215080)
    }
}