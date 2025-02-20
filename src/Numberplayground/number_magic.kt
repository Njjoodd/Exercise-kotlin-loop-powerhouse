package Numberplayground

fun main() {
    countUpwards(1, 10)
    countDownwards(10, 1)
}

fun countUpwards(start: Int, end: Int) {
    for (i in start..end) {
        println(i)
    }
}

fun countDownwards(end: Int, start: Int) {
    var i = end
    while (i >= start) {
        println(i)
        i--
    }
}
