object DiagonalDifference {
    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        var n = sc.nextInt()
        var a = Array.ofDim[Int](n,n)
        for(a_i <- 0 until n) {
            for(a_j <- 0 until n){
                a(a_i)(a_j) = sc.nextInt()
            }
        }
    }
}
