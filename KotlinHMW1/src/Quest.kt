class Quest {
    fun averageOfEven(list: IntArray): Int {
        var sum = 0
        var count = 0
        var i = 0
        while (i < list.size) {
            sum += list[i]
            count += 1
            i += 2
        }
        return sum / count
    }

    fun isPalindrome(text: String): Boolean {
        for (i in 0 until text.length / 2) {
            if (text[i] != text[text.length - i - 1]) {
                return false
            }
        }
        return true
    }
}