// Решение задачи на построение "Треугольника Паскаля" на Kotlin
// Референс: https://www.codewars.com/kata/5e4e8f5a72d9550032953717

fun main() {
    val count: Int = 4
    val listOfNumbers = ArrayList<String>()
    listOfNumbers.add("1/1")
    var powerCount: Int = -1
    var value = 0
    for (treeIndex in 1..count) {
        val sizeOfResultList = listOfNumbers.size
        for (lastNumber in listOfNumbers
            .slice(indices = (value until sizeOfResultList))) {
            val firstNum: Int = lastNumber
                .split("/")[0]
                .toInt()
            val secondNum: Int = lastNumber
                .split("/")[1]
                .toInt()
            val sum: Int = firstNum + secondNum
            for (i in 1..2) {
                if (i == 1) {
                    listOfNumbers
                        .add("$firstNum/$sum")
                } else {
                    listOfNumbers
                        .add("$sum/$secondNum")
                }
            }
        }
        value = sizeOfResultList
        powerCount++

    }
    var c = 1
    var goalC = 0
    var tabsCount = count * 2 + 2
    for (i in listOfNumbers) {
        val tabsString = "\t".repeat(tabsCount)
        goalC += 1
        if (c == goalC) {
            c *= 2
            println()
            print(tabsString)
            tabsCount -= 2
        }
        if (tabsCount == 0){
            tabsCount = 1
        }
        print(i)
        print("\t")



    }
}
