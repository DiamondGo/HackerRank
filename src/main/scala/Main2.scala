object Main2 extends App {
    // your code goes here
    import io.StdIn._

    val N = readInt

    (1 to N).map(_ => readInt).foreach({case n : Int => println((1 to n).fold(1)(_*_))})
}