object Main extends App {
    // your code goes here
    import io.StdIn._

    val N = readInt

    def tailZero(n : Int) =
        Stream.from(1).map(n / math.pow(5, _).toInt).takeWhile(_ > 0).sum

    (1 to N).map(_ => readLine.toInt).foreach({case n : Int => println(tailZero(n))})
}