class DayTwo {
    fun diveSolution(input: List<Pair<String, Int>>): Int {
        val inputBucket: List<Pair<String, Int>> = input
            .groupBy { it.first }
            .flatMap { it.value }
        
        val horizontal = inputBucket.filter { it.first == "forward" }.sumOf { it.second }
        val down = inputBucket.filter { it.first == "down" }.sumOf { it.second }
        val up = inputBucket.filter { it.first == "up" }.sumOf { it.second }
        
        return horizontal * (down - up)
    }
}