object NumberSteps extends App {
    // your code goes here
    import io.StdIn._

    val N = readInt

    def step(as: Array[String]) = {
        val x = as(0).toInt
        val y = as(1).toInt

        if (x == y) {
            if (x % 2 == 0) {
                (x * 2).toString
            } else {
                (x * 2 -1).toString
            }
        } else {
            if (x == y + 2) {
                if (x % 2 == 0) {
                    (x * 2 -2).toString
                } else {
                    (x * 2 -3).toString
                }
            } else {
                "No Number"
            }
        }
    }

    (1 to N).map(_ => """\s+""".r.split(readLine)).foreach({ case as: Array[String] => println(step(as)) })
}
