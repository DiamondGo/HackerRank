import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val N = readLine()!!.toInt()
    val matrix = (1..N).map { readLine()!!.split(" ").map { it.toInt() }}

    val diff = Math.abs(matrix.withIndex().map { (i, v) -> v[i] }.sum() - matrix.withIndex().map { it.value[N - 1 - it.index] }.sum())
    println(diff)
}