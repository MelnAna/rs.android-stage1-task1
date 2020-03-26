package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val happyArray = ArrayList<Int>()
        sadArray.forEach { happyArray.add(it) }
        var index = 1
        while (index < happyArray.size - 1) {
            if (happyArray[index] > happyArray[index - 1] + happyArray[index + 1]) {
                happyArray.remove(happyArray[index])
                index = 1
            }
            index++
        }
        return happyArray.toIntArray()
    }
}
