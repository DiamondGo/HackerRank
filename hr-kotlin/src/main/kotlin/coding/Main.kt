/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package coding

class Main {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main(args: Array<String>) {
    var c = "haha"
    println(Main().greeting + " " + c)
    Dummy.main(args)
}
