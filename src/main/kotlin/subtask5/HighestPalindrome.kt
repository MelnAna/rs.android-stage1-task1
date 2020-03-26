package subtask5

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val max = getMax(digitString)
        val result = StringBuilder(digitString)
        var count = 0

        for (i in 0 until n / 2) {
            if (digitString[i] != digitString[n - i - 1]) {
                result[i] = max
                result[n - i - 1] = max
                count++
            }
        }
        if (count > k) {
            return "-1"
        }
        return result.toString()
    }

    private fun getMax(digitString: String): Char {
        var max = 0
        for (digit in digitString) {
            val i = digit.toInt()
            if (i > max) {
                max = i
            }
        }
        return max.toChar()
    }
}
