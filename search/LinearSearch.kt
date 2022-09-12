fun main() {
    val arr = IntArray(100) { it + 1 }

    val result = linearSearch(arr, 7)
    println(result)
}
fun linearSearch(arr: IntArray, key: Any): Int? {
    for ((index, value) in arr.withIndex()) {
        if (value == key) {
            return index
        }
    }
    return null
}