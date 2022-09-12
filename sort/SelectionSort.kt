fun main() {
    val arr: IntArray = intArrayOf(15, 3, 12, 6, -9, 9, 0)
    selectionSort(arr)
    println(arr.contentToString())

}

fun selectionSort(arr: IntArray) {
    val lastIndex: Int = arr.size - 1

    for (i in 0 until lastIndex) {
        var minIndex = i

        for (j in (i + 1)..lastIndex) {
            if (arr[minIndex] > arr[j]) {
                minIndex = j
            }
        }

        val temp = arr[minIndex]
        arr[minIndex] = arr[i]
        arr[i] = temp
    }
}