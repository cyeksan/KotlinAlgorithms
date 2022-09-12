fun main() {
    val str = "Hello"
    println(reverseWithStringBuilder(str))        // olleH
    println(reverseWithPlusOperator(str))        // olleH
    println(reverseWithCharArray(str))        // olleH
}

private fun reverseWithStringBuilder(str: String): String {
    return StringBuilder(str).reverse().toString()
}

private fun reverseWithPlusOperator(str: String): String {
    var reverse = ""
    for (i in str.length - 1 downTo 0) {
        reverse += str[i]
    }
    return reverse
}

private fun reverseWithCharArray(str: String): String {
    val chars = CharArray(str.length)
    str.indices.forEach { chars[str.length - it - 1] = str[it] }
    return String(chars)
}
