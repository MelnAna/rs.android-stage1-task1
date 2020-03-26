package subtask3

class BillCounter {

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val sum: Int
        val billAnna = (bill.sum() - bill[k]) / 2
        if (billAnna - b == 0) {
            return "Bon Appetit"
        } else sum = b - billAnna
        return sum.toString()
    }
}
