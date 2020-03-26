package subtask4

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val resultString = ArrayList<String>()
        val brackets = listOf('<', '(', '[', '>', ')', ']')
        val stringBuilder = StringBuilder(inputString)

        for (i in stringBuilder.length - 1 downTo 0) {
            if (stringBuilder[i] in brackets.subList(0, 3)) {
                var lastIndex = 0
                for (k in i until stringBuilder.length) {
                    if (stringBuilder[k] == brackets[brackets.indexOf(inputString[i]) + 3]) {
                        lastIndex = k
                        stringBuilder[i] = '|'
                        stringBuilder[lastIndex] = '|'
                        break
                    }
                }
                resultString.add(0, inputString.substring(i + 1, lastIndex))
            }
        }
        return resultString.toTypedArray()
    }
}
