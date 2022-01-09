import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DayTwoTest {
    private val dayTwo = DayTwo()
    private val testInput: List<Pair<String, Int>> = listOf(Pair("forward", 5),Pair("down", 5),Pair("forward", 8),Pair("up", 3),Pair("down", 8),Pair("forward", 2))
    
    @Test
    fun `Should return product of horizontal total + depth total`() {
        val diveSolution = dayTwo.diveSolution(testInput)

        assertThat(diveSolution).isEqualTo(150)
    }
}