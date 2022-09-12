fun main() {
    val list = mutableListOf(8, 3, 2, 7, 4)
    println(insertionSort(list))
}

fun insertionSort(items: MutableList<Int>): List<Int> {
    if (items.isEmpty() || items.size < 2) {
        return items
    }
    for (count in 1 until items.count()) {
        val item = items[count]
        var i = count
        while (i > 0 && item < items[i - 1]) {
            items[i] = items[i - 1]
            i -= 1
        }
        items[i] = item
    }
    return items
}