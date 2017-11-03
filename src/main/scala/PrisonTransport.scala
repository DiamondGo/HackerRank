object PrisonTransport {
    import io.StdIn._
    import scala.collection.mutable.Map
    import scala.collection.mutable.Set
    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        val n = readInt
        val m = readInt

        var groupId = 0
        val groupMap = Map[Int, Int]()

        for (_ <- 0 until m) {
            val Array(l, r) = readLine.split(" ").map(_.toInt)
            (groupMap.get(l), groupMap.get(r)) match {
                case (None, None) =>
            }
        }
    }
}
