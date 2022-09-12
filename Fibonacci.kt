fun main() {
    println(getFibonacciRecursive1(10))
    println(getFibonacciRecursive2(10))

}

fun getFibonacciRecursive1(num: Int): Int {
    if (num < 2) return num
    return getFibonacciRecursive1(num - 1) + getFibonacciRecursive1(num - 2)
}

fun getFibonacciRecursive2(n: Int, first: Int = 0, second: Int = 1): Int =
    when (n) {
        0 -> first
        1 -> second
        else -> getFibonacciRecursive2(n - 1, second, first + second)
    }




