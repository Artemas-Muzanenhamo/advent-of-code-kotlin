import kotlin.math.sign

class DayOne {
//    val input = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)

    fun solution(input: List<Int>): Int {
        return input
            .windowed(2)
            .count { (currentNumber, nextNumber) -> currentNumber < nextNumber}
    }
}