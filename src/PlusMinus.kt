// https://www.hackerrank.com/challenges/plus-minus/problem

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.Arrays.stream
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {
    val numberGroup = arr.groupBy {
        when {
            it > 0 -> 1
            it < 0 -> -1
            else -> 0
        }
    }

   listOf(1, -1, 0).forEach {
        println((numberGroup[it]?.size?.toFloat() ?: 0f) / arr.size.toFloat())
   }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}

