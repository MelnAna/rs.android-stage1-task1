package subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {
        val result = ArrayList<Int>()
        input.sort()
        var maxSum = 0
        var minSum = 0
        for (i in input) {
            if (i != input.first()) maxSum += i
        }
        for (i in input) {
            if (i != input.last()) minSum += i
        }
        result.add(minSum)
        result.add(maxSum)
        return result.toIntArray()
    }
}
