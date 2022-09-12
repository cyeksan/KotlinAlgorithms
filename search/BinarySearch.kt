fun main() {
    val arr = IntArray(100) { it + 1 }
    // We are searching for number 7:
    val resultBinary = binarySearchRecursive(arr, 7, 0, arr.size - 1)
    println(resultBinary.toString())

    val resultIterative = binarySearchIterative(arr, 7)
    println(resultIterative.toString())

}

fun binarySearchRecursive(input: IntArray, searchedNumber: Int, minIndex: Int, maxIndex: Int): Int {
    while (minIndex <= maxIndex) {
        val midIndex = (maxIndex + minIndex) / 2
        when {
            searchedNumber > input[midIndex] -> return binarySearchRecursive(
                input,
                searchedNumber,
                midIndex + 1,
                maxIndex
            )
            searchedNumber < input[midIndex] -> return binarySearchRecursive(
                input,
                searchedNumber,
                minIndex,
                midIndex - 1
            )
            searchedNumber == input[midIndex] -> return midIndex
        }
    }
    return -1
}

fun binarySearchIterative(input: IntArray, searchedNumber: Int): Int {
    var minIndex = 0
    var maxIndex = input.size - 1
    var midIndex: Int
    while (minIndex <= maxIndex) {
        midIndex = minIndex + ((maxIndex - minIndex) / 2)
        when {
            searchedNumber > input[midIndex] -> minIndex =
                midIndex + 1    // element is greater than middle element of array, so it will be in right half of array
            searchedNumber == input[midIndex] -> return midIndex // found the element
            searchedNumber < input[midIndex] -> maxIndex =
                midIndex - 1   //element is less than middle element of array, so it will be in left half of the array.
        }
    }
    return -1
}
