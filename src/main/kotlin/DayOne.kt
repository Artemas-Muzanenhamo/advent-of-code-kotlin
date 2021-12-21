class DayOne {
    fun sonarSweepFirstPartSolution(input: List<Int>): Int {
        return input
            .windowed(2)
            .count { (currentNumber, nextNumber) -> currentNumber < nextNumber}
    }

    fun sonarSweepSecondPartSolution(input: List<Int>): Int {
        return input.windowed(3)
            .map { it.sum() }
            .windowed(2)
            .count { (currentNumber, nextNumber) -> currentNumber < nextNumber}
    }
}