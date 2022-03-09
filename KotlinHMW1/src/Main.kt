object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val `object` = Quest()
        val list = intArrayOf(7, 3, 4, 2, 6, 2, 1, 6, 3, 4, 5, 5)
        System.out.println("ლუწ ინდექსებზე მდგომი რიცხვების საშუალო = " + `object`.averageOfEven(list))
        System.out.println("პალინდრომი = " + `object`.isPalindrome("abcba"))
    }
}