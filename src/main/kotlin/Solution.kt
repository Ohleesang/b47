class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val range = Pair(
            (-board[0] / 2..board[0] / 2), (-board[1] / 2..board[1] / 2)
        )
        var coor = Pair(0, 0)
        keyinput.forEach { input ->
            when (input) {
                "up" -> {
                    if (range.second.contains(coor.second + 1))
                        coor = coor.copy(second = coor.second + 1)
                }

                "down" -> {
                    if (range.second.contains(coor.second - 1))
                        coor = coor.copy(second = coor.second - 1)
                }

                "left" -> {
                    if (range.first.contains(coor.first - 1))
                        coor = coor.copy(first = coor.first - 1)
                }

                "right" -> {
                    if (range.first.contains(coor.first + 1))
                        coor = coor.copy(first = coor.first + 1)
                }
            }

        }
        answer = intArrayOf(coor.first, coor.second)
        return answer
    }
}

fun main() {
    val a = Solution()
    a.solution(
        arrayOf("left", "right", "up", "right", "right"),
        intArrayOf(11, 11)
    )//2,1

    a.solution(
        arrayOf("down", "down", "down", "down", "down"),
        intArrayOf(7, 9)
    )//0,-4
}