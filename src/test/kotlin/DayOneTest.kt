import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DayOneTest {
    private val dayOne = DayOne()
    private val input = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)

    @Test
    fun `Should return measurements larger than previous`() {
//        val fileContent = javaClass.getResource("day1-input.txt")!!.readText().lines().map { it.toInt() }
//        val solution = dayOne.solution(fileContent)
        val solution = dayOne.solution(input)

        assertThat(solution).isEqualTo(7)
    }
}