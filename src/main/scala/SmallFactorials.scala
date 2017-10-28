object SmallFactorials extends App {
    // your code goes here
    import io.StdIn._

    val N = readInt

    if (N >= 1)
        (1 to N).map(_ => readInt).foreach({case n : Int => println((1 to n).map(BigInt(_)).fold(BigInt(1))(_ * _))})
}
