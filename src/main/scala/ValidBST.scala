object ValidBST {
    import io.StdIn._

    def isValid(values:Array[Int]): Boolean = {
        if (values.length <= 1)
            return true
        /*
        for(i <- 0 until values.length) {
            val l = values.slice(0, i)
            val id = values(i)
            val r = values.slice(i+1, values.length)
            if ((l.length == 0 || l.max < id) && (r.length == 0 || r.min > id) && isValid(l) && isValid(r))
                return true
        }
        */
        val id = values(0)
        for (i <- 1 to values.length) {
            val l = values.slice(1, i)
            val r = values.slice(i, values.length)
            if ((l.length == 0 || l.max < id) && (r.length == 0 || r.min > id) && isValid(l) && isValid(r))
                return true
        }
        return false
    }

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        val t = readInt
        for (_ <- 1 to t) {
            val n = readInt
            val preOrder:Array[Int] = readLine.split(" ").map(_.toInt)
            println(if (isValid(preOrder)) "YES" else "NO")
        }
    }
}
