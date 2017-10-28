object StringOPermute {
    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val T = readInt
        for (i <- 1 to T) {
            val s = readLine
            //val p = s.zipWithIndex.filter{ case (_, i) => i % 2 == 0 }.map{ case (c, _) => c }.mkString("")
            s.sliding(2, 2).map{}
            println(p)
        }
    }
}
